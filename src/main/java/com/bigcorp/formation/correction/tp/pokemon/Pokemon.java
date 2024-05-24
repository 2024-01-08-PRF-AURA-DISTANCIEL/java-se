package com.bigcorp.formation.correction.tp.pokemon;

import java.util.Random;

import com.bigcorp.formation.correction.tp.pokemon.attaque.Attaque;
import com.bigcorp.formation.correction.tp.pokemon.modele.TypePokemon;

/**
 * Classe de Pokemon de base. Contient tous les attributs et les méthodes
 * mutualisables par tous les pokemons, mais ne peut être instanciée (est
 * abstraite).
 */
public abstract class Pokemon {

	private static final int GAIN_POINT_DE_VIE_PAR_NIVEAU = 10;
	private static final int GAIN_EXPERIENCE_PROMENADE = 2;
	private Integer id;
	private String nom;
	private String nomEspece;
	private Integer pointsDeVieMax;
	private Integer pointsDeVie;
	private Integer experience = 0;
	private Integer niveau = 1;
	private TypePokemon type;
	private Attaque attaque;

	protected Pokemon(Integer id, String nom, String nomEspece,
			Integer pointsDeVieMax, TypePokemon type,
			Attaque attaque) {
		super();
		this.id = id;
		this.nom = nom;
		this.nomEspece = nomEspece;
		this.pointsDeVieMax = pointsDeVieMax;
		this.pointsDeVie = this.pointsDeVieMax;
		this.type = type;
		this.attaque = attaque;
	}

	public Integer getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getNomEspece() {
		return nomEspece;
	}

	public Integer getPointsDeVieMax() {
		return pointsDeVieMax;
	}

	public Integer getPointsDeVie() {
		return pointsDeVie;
	}

	public Integer getExperience() {
		return experience;
	}

	public TypePokemon getType() {
		return type;
	}

	public Attaque getAttaque() {
		return attaque;
	}

	@Override
	public String toString() {
		return this.nom;
	}

	/**
	 * this subit degats.
	 * 
	 * @param degats
	 * @param libelleAttaquant
	 * @param messageSupplementaire
	 */
	public void subit(int degats, String libelleAttaquant) {
		this.pointsDeVie -= degats;
		if (this.pointsDeVie < 0) {
			this.pointsDeVie = 0;
		}
		System.out.println(libelleAttaquant + " inflige " + degats + " points de dégâts à " + this.nom + ".");
	}

	/**
	 * Redonne à this le nombre de points de vie maximum.
	 */
	public void resetPointsDeVie() {
		this.pointsDeVie = this.pointsDeVieMax;
	}

	/**
	 * Augmente l'expérience de this (ajoute pointsExperienceGagnes). Peut augmenter
	 * le niveau.
	 * 
	 * @param pointsExperienceGagnes
	 */
	public void gagneExperience(int pointsExperienceGagnes) {
		System.out.println("Le pokemon : " + this.nom + " remporte " + pointsExperienceGagnes
				+ " points d'expérience.");
		this.experience += pointsExperienceGagnes;
		System.out.println("Le pokemon : " + this.nom + " a désormais " + this.experience + " points d'expérience.");
		//En Java, la division de deux entiers renvoie la partie entière de la division.
		//ici, on ajoute 1 pour retomber sur le niveau du Pokémon.
		//De 0 à 4, on aura 1, de 5 à 9, 2, etc ...
		int niveauSuitePointsExperience = (this.experience / 5) + 1;
		if (niveauSuitePointsExperience > this.niveau) {
			int diffNiveau = niveauSuitePointsExperience - this.niveau;
			this.niveau = niveauSuitePointsExperience;
			System.out.println("Le pokemon : " + this.nom + " passe au niveau " + this.niveau);
			this.pointsDeVieMax += GAIN_POINT_DE_VIE_PAR_NIVEAU * diffNiveau;
		}

	}

	/**
	 * Affiche le résumé de this dans la console
	 */
	public void afficheResumeConsole() {
		System.out.println(this.id + "-" + this.nom + "-" + this.nomEspece + "-" + this.niveau);
	}

	/**
	 * Ceci utilise une nouveauté de Java 17 : les chaînes de caractères sur
	 * plusieurs lignes (notez l'utilisation des triples guillemets). Ceci permet
	 * d'écrire dans le code des longues String de façon plus lisible
	 */
	public void afficheConsole() {
		System.out.println("""
				Pokemon :
				   id:%1$s
				   nom:%2$s
				   nomEspece:%3$s
				   pointsDeVieMax:%4$s
				   experience:%5$s
				   niveau :%6$s
				   type:%7$s
				   attaque:%8$s""".formatted(this.id, this.nom, this.nomEspece,
				this.pointsDeVieMax, this.experience, this.niveau, this.type, this.attaque));
	}

	public Integer getNiveau() {
		return niveau;
	}

	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}

	public void parle() {

		Random r = new Random();
		int nombreRepetitions = r.nextInt(1, 4);
		int choixPonctuation = r.nextInt(1, 4);
		String ponctuation = switch (choixPonctuation) {
		case 1 -> "!";
		case 2 -> "?";
		default -> ".";
		};

		// Ici, on devrait utiliser StringBuilder, la classe qui sert
		// à concaténer des chaînes de caractère, ou mieux
		// String.repeat(). J'ai mis les exemples en commentaire en dessous
		String message = "";
		for (int i = 0; i < nombreRepetitions; i++) {
			message += this.nomEspece + " ";
		}
		message += ponctuation;
		
		//Avec StringBuilder, on ferait comme ça : 
//		StringBuilder messageBuilder = new StringBuilder();
//		for (int i = 0; i < nombreRepetitions; i++) {
//			messageBuilder.append(this.nomEspece).append(" ");
//		}
//		messageBuilder.append(ponctuation);
//		String message = messageBuilder.toString();
		
		//Avec repeat, on ferait : 
//		String message = this.nomEspece + " ";
//		message = message.repeat(3);
//		message+= ponctuation;
		System.out.println(this.nom + " dit : " + message);

	}

	public void promene(Promenade promenade) {
		if (this.type == promenade.getTypePokemonQuiApprecieLaPromenade()) {
			System.out.println(this.nom + " a apprécié la promenade : " + promenade.getNom());
			gagneExperience(GAIN_EXPERIENCE_PROMENADE);
		} else {
			System.out.println(this.nom + " n'a pas apprécié la promenade : " + promenade.getNom());
		}
	}

}
