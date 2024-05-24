package com.bigcorp.formation.correction.tp.pokemon;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.bigcorp.formation.correction.tp.pokemon.arene.Arene;
import com.bigcorp.formation.correction.tp.pokemon.arene.Marais;
import com.bigcorp.formation.correction.tp.pokemon.arene.Prairie;
import com.bigcorp.formation.correction.tp.pokemon.arene.Volcan;
import com.bigcorp.formation.correction.tp.pokemon.modele.TypePokemon;
import com.bigcorp.formation.correction.tp.pokemon.referentiel.APIReferentiel;

/**
 * Classe Main : gère le lancement du jeu et les entrées au clavier
 */
public class Main {

	private APIReferentiel apiReferentiel;

	/**
	 * Le scanner est mis ici pour en garder une unique instance dans this. Pourquoi
	 * ? Si on le ferme, on ferme aussi System.in, ce qui interdit toute
	 * réutilisation de System.in, et donc toute nouvelle entrée dans la console. Du
	 * coup, scannerIn sera initialisé une seule fois et fermé une seule fois (à la
	 * fin du programme).
	 */
	private Scanner scannerIn;

	public static void main(String[] args) {
		Main main = new Main();
		main.execute();
	}

	/**
	 * Méthode de boucle principale de gameplay
	 */
	private void execute() {
		this.apiReferentiel = new APIReferentiel();

		System.out.println("Bienvenue dans le module d'entraînement des Pokémons");
		boolean boucle = true;
		this.scannerIn = new Scanner(System.in);
		while (boucle) {
			System.out.println("\n\nVeuillez choisir une option parmi celles qui suivent");
			System.out.println("1-Afficher tous les pokémons");
			System.out.println("2-Afficher tous les pokémons triés");
			System.out.println("3-Afficher un pokémon par son identifiant");
			System.out.println("4-Faire combattre deux pokémons");
			System.out.println("5-Faire discuter les pokémons");
			System.out.println("6-Promener un pokémon");
			System.out.println("7-Quitter");
			int choix = 0;

			String input = null;
			input = this.scannerIn.nextLine();

			try {
				choix = Integer.parseInt(input);
			} catch (Exception e) {
				System.out.println("Choix incorrect");
				continue;
			}

			switch (choix) {
			case 1 -> {
				affichePokemons();
			}
			case 2 -> {
				choixTri();
			}
			case 3 -> {
				affichePokemonParSonIdentifiant();
			}
			case 4 -> {
				combat();
			}
			case 5 -> {
				discussion();
			}
			case 6 -> {
				promenade();
			}
			case 7 -> {
				boucle = false;
			}
			default -> {
				System.out.println("Choix incorrect.");
			}
			}
		}
		scannerIn.close();
	}

	/**
	 * Fait discuter au plus 5 pokémons, choisis au hasard.
	 */
	private void discussion() {
		List<Pokemon> listePokemons = this.apiReferentiel.getAllPokemons();
		Collections.shuffle(listePokemons);

		for (int i = 0; i < 5 && i < listePokemons.size(); i++) {
			listePokemons.get(i).parle();
		}

	}

	/**
	 * Affiche tous les pokemons
	 */
	private void affichePokemons() {
		for (Pokemon pokemon : this.apiReferentiel.getAllPokemons()) {
			pokemon.afficheResumeConsole();
		}
	}

	/**
	 * Affiche tous les pokemons triés par expérience croissante
	 */
	private void affichePokemonsTriesParExperienceCroissante() {
		final List<Pokemon> allPokemons = this.apiReferentiel.getAllPokemons();
		allPokemons.sort((p1, p2) -> p1.getExperience() - p2.getExperience());
		for (Pokemon pokemon : allPokemons) {
			pokemon.afficheConsole();
		}
	}

	/**
	 * Affiche tous les pokemons triés par expérience décroissante
	 */
	private void affichePokemonsTriesParExperienceDecroissante() {
		final List<Pokemon> allPokemons = this.apiReferentiel.getAllPokemons();
		allPokemons.sort((p1, p2) -> p2.getExperience() - p1.getExperience());
		for (Pokemon pokemon : allPokemons) {
			pokemon.afficheConsole();
		}
	}

	/**
	 * Affiche tous les pokemons après les avoir triés
	 */
	private void choixTri() {
		System.out.println("Veuillez choisir une option parmi celles qui suivent");
		System.out.println("1-Trier par expérience croissante");
		System.out.println("2-Trier par expérience décroissante");
		int choix = 0;
		try {
			String input = this.scannerIn.nextLine();
			choix = Integer.parseInt(input);
		} catch (Exception e) {
			System.out.println("Choix incorrect");
			return;
		}
		switch (choix) {
		case 1 -> {
			affichePokemons();
		}
		case 2 -> {
			affichePokemonsTriesParExperienceCroissante();
		}
		case 3 -> {
			affichePokemonsTriesParExperienceDecroissante();
		}
		default -> {
			System.out.println("Choix incorrect.");
		}

		}

	}

	/**
	 * Affiche un pokemon, après avoir demandé son identifiant
	 */
	private void affichePokemonParSonIdentifiant() {
		System.out.println("Veuillez choisir un identifiant ");
		Pokemon pokemon = demandePokemonParId();
		if (pokemon == null) {
			System.out.println("Aucun pokémon trouvé avec cet identifiant.");
			return;
		}
		// else ...
		pokemon.afficheConsole();
	}

	/**
	 * Fight !!!!
	 */
	private void combat() {
		System.out.println("Veuillez choisir un identifiant de pokemon 1 pour le combat");
		Pokemon pokemon1 = demandePokemonParId();
		System.out.println("Veuillez choisir un identifiant de pokemon 2 pour le combat");
		Pokemon pokemon2 = demandePokemonParId();
		if (pokemon1 == pokemon2) {
			System.out.println("Impossible de faire combattre un pokemon contre lui-même");
			return;
		}
		if (pokemon1 == null || pokemon2 == null) {
			System.out.println("Un pokemon est inconnu : impossible de commencer le combat");
			return;
		}
		Arene arene = demandeArene();
		Combat combat = new Combat(pokemon1, pokemon2, arene);
		combat.lanceCombat();
	}

	/**
	 * Fight !!!!
	 */
	private void promenade() {
		System.out.println("Veuillez choisir un identifiant de pokemon pour la promenade");
		Pokemon pokemon = demandePokemonParId();
		System.out.println("Veuillez choisir une option parmi celles qui suivent");
		System.out.println("1-Plage");
		System.out.println("2-Jungle");
		System.out.println("3-Jardin");
		System.out.println("4-Désert");
		int choix = 0;
		try {
			String input = this.scannerIn.nextLine();
			choix = Integer.parseInt(input);
		} catch (Exception e) {
			System.out.println("Choix incorrect");
			return;
		}
		switch (choix) {
		case 1 -> {
			pokemon.promene(new Promenade("Plage", TypePokemon.EAU));
		}
		case 2 -> {
			pokemon.promene(new Promenade("Jungle", TypePokemon.INSECTE));
		}
		case 3 -> {
			pokemon.promene(new Promenade("Jardin", TypePokemon.PLANTE));
		}
		default -> {
			pokemon.promene(new Promenade("Désert", TypePokemon.AIR));
		}

		}
	}

	/**
	 * Retourne un pokemon après avoir demandé son identifiant à la console
	 * 
	 * @return
	 */
	private Pokemon demandePokemonParId() {
		int id = 0;
		try {
			String input = this.scannerIn.nextLine();
			id = Integer.parseInt(input);
		} catch (Exception e) {
			System.out.println("Choix incorrect");
			return null;
		}
		return this.apiReferentiel.getPokemonById(id);
	}

	/**
	 * Affiche un message de sélection d'arène puis renvoie une arène sélectionnée à
	 * la console
	 * 
	 * @return
	 */
	private Arene demandeArene() {
		System.out.println("Veuillez choisir une arène : ");
		System.out.println("1-Prairie");
		System.out.println("2-Volcan");
		System.out.println("3-Marais");
		int id = 0;
		try {
			String input = this.scannerIn.nextLine();
			id = Integer.parseInt(input);
		} catch (Exception e) {
			System.out.println("Choix incorrect : choix prairie par défaut");
			return new Prairie();
		}

		switch (id) {
		case 1:
			return new Prairie();
		case 2:
			return new Volcan();
		case 3:
			return new Marais();
		default:
			System.out.println("Choix incorrect : choix prairie par défaut");
			return new Prairie();

		}

	}

}
