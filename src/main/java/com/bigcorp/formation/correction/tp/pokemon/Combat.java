package com.bigcorp.formation.correction.tp.pokemon;

import com.bigcorp.formation.correction.tp.pokemon.arene.Arene;
import com.bigcorp.formation.correction.tp.pokemon.attaque.Attaque;
import com.bigcorp.formation.correction.tp.pokemon.modele.TypePokemon;

/**
 * Classe de gestion des combats : contient le code
 */
public class Combat {

	public static final float MODIFICATEUR_DEGAT_PAR_DEFAUT = 1f;

	private Pokemon pokemon1;
	private Pokemon pokemon2;
	private Arene arene;

	public Combat(Pokemon pokemon1, Pokemon pokemon2, Arene arene) {
		super();
		this.pokemon1 = pokemon1;
		this.pokemon2 = pokemon2;
		this.arene = arene;
	}

	/**
	 * Lance le combat entre ces deux pokemons. Ne s'arrête que lorsque l'un des
	 * pokemons est KO.
	 */
	public void lanceCombat() {

		// 1. Début du combat : initialisation des points de vie des pokémons
		this.pokemon1.resetPointsDeVie();
		this.pokemon2.resetPointsDeVie();
		
		// 2. l’arène applique son effet unique par combat (optionnel)
		this.arene.effetUnique(pokemon1, pokemon2);

		// 3. un pokémon est choisi au hasard, il sera désigné sous le nom de pokémon1,
		// l’autre sera désigné sous le nom de pokémon2
		boolean pokemon1Commence = Math.random() > 0.5;

		// 4. début du tour de jeu
		while (true) {
			System.out.println("\n----Un nouveau Round commence !");
			// 5. l’arène applique son effet qui s’applique à chaque tour de jeu(optionnel)
			this.arene.effetPermanent(pokemon1, pokemon2);
			if (pokemon1Commence) {
				// 6. le pokémon1 attaque, l’effet de l’attaque s’applique.
				attaque(pokemon1, pokemon2);
				// 7. si le pokémon2 est KO (plus de point de vie), le match est terminé : le
				// pokémon1 a gagné.
				if (combatTermine()) {
					return;
				}
				// 8. le pokémon2 attaque, l’effet de l’attaque s’applique.
				attaque(pokemon2, pokemon1);
				// 9. si le pokémon1 est KO (plus de point de vie), le match est terminé : le
				// pokémon2 a gagné.
				if (combatTermine()) {
					return;
				}
			} else {
				attaque(pokemon2, pokemon1);
				if (combatTermine()) {
					return;
				}
				attaque(pokemon1, pokemon2);
				if (combatTermine()) {
					return;
				}
			}

			// 10. Si aucun pokémon n’est KO, on retourne à l’étape 3.
		}

	}

	/**
	 * Renvoie vrai si le combat est terminé. Dans ce cas, déclare le vainqueur et
	 * ajoute l'expérience gagnée à celui-ci.
	 * 
	 * @return
	 */
	private boolean combatTermine() {
		if (this.pokemon1.getPointsDeVie() == 0) {
			System.out.println("Le pokemon : " + this.pokemon1 + " est KO.");
			System.out.println("Le pokemon : " + this.pokemon2 + " remporte la victoire.");

			int pointsExperienceGagnes = this.pokemon1.getNiveau() * 4;
			pokemon2.gagneExperience(pointsExperienceGagnes);

			return true;
		}

		if (this.pokemon2.getPointsDeVie() == 0) {
			System.out.println("Le pokemon : " + this.pokemon2 + " est KO.");
			System.out.println("Le pokemon : " + this.pokemon1 + " remporte la victoire.");

			int pointsExperienceGagnes = this.pokemon2.getNiveau() * 4;
			pokemon1.gagneExperience(pointsExperienceGagnes);

			return true;
		}
		return false;
	}

	/**
	 * Une attaque de pokemon1 survient sur pokemon2
	 * 
	 * @param attaquant
	 * @param cible
	 * @return
	 */
	private void attaque(Pokemon attaquant, Pokemon cible) {
		float degatsDeBase = attaquant.getAttaque().getDegats();
		float modificateurType = calculeModificateur(attaquant.getAttaque(), cible.getType());
		float modificateurNiveau = Math.max(1, (int) (attaquant.getNiveau() / 10));
		int nombreDegats = (int) (degatsDeBase * modificateurType * modificateurNiveau);

		System.out.println(attaquant + " utilise " + attaquant.getAttaque() + " sur " + cible + ".");

		if (modificateurType > MODIFICATEUR_DEGAT_PAR_DEFAUT) {
			System.out.println("C'est super efficace !");
		} else if (modificateurType < MODIFICATEUR_DEGAT_PAR_DEFAUT) {
			System.out.println("Ce n'est pas très efficace ...");
		}

		cible.subit(nombreDegats, attaquant.getNom());
		System.out.println(cible.getNom() + " a désormais " + cible.getPointsDeVie() + " points de vie.");
		// "Truc" qui arrête le Thread principal pendant 2.5 secondes pour espacer les
		// tours du combat
		// Une InterruptedException est transformée en RuntimeException (toute erreur
		// ici fait donc
		// arrêter le programme)
		try {
			Thread.sleep(2_500);
		} catch (InterruptedException e) {
			throw new RuntimeException("Erreur de thread");
		}
	}

	/**
	 * Calcule les degats en fonction de l'attaque et du type de Pokemon Cible.
	 * Utilise yield pour la beauté du geste, mais l'utilisation de return
	 * directement dans le switch pourrait aussi convenir.
	 * 
	 * @param attaque
	 * @param typePokemonCible
	 * @return
	 */
	private float calculeModificateur(Attaque attaque, TypePokemon typePokemonCible) {
		float modificateur = switch (attaque.getType()) {
		case EAU: {
			switch (typePokemonCible) {
			case AIR: {
				yield 0.75f;
			}
			case PLANTE: {
				yield 1.25f;
			}
			default: {
				yield MODIFICATEUR_DEGAT_PAR_DEFAUT;
			}
			}
		}
		case AIR: {
			switch (typePokemonCible) {
			case EAU: {
				yield 1.25f;
			}
			case INSECTE: {
				yield 0.75f;
			}
			default: {
				yield MODIFICATEUR_DEGAT_PAR_DEFAUT;
			}
			}
		}
		case INSECTE: {
			switch (typePokemonCible) {
			case AIR: {
				yield 1.25f;
			}
			case PLANTE: {
				yield 0.75f;
			}
			default: {
				yield MODIFICATEUR_DEGAT_PAR_DEFAUT;
			}
			}
		}
		case PLANTE: {
			switch (typePokemonCible) {
			case EAU: {
				yield 0.75f;
			}
			case INSECTE: {
				yield 1.25f;
			}
			default: {
				yield MODIFICATEUR_DEGAT_PAR_DEFAUT;
			}
			}
		}
		default: {
			yield MODIFICATEUR_DEGAT_PAR_DEFAUT;
		}
		};

		return modificateur;
	}

}
