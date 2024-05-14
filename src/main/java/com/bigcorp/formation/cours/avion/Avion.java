package com.bigcorp.formation.cours.avion;


/**
 * Classe simulant un avion
 */
public class Avion {

	// Compteur d'avions construits par la classe, statique
	// propre à la classe et partagé par toutes les instances
	public static int compteurDAvions;
	
	//Poids en kilos
	public static final int POIDS_MAX_AVION = 13_000_000;

	// attributs liés aux instances

	// Le nom est devenu immutable grâce à final,
	// il ne pourra plus être modifié après la construction
	// de l'objet
	protected final String nom;
	protected int capacitePassagers;
	String nomCompagnie;
	protected int carburant;
	private int capaciteCarburant = 10_000;
	
	/**
	 * Constructeur avec un argument. La création de ce constructeur a supprimé le
	 * constructeur par défaut , qui n'a pas d'arguments.
	 * 
	 * @param nom
	 */
	public Avion(String nom) {
		compteurDAvions++;
		this.nom = nom;
		System.out.println("Je suis en train de construire un avion");
	}

	/**
	 * Getter, ou accesseur en lecture de nom, généré par l'IDE, normalement sans Javadoc
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}
	
	public void castNom() {
		String uneAutreVariable = nom;
		String uneAutreString = (String) nom;
	}
	

	/**
	 * Setter, ou accesseur en lecture de carburant, généré par l'IDE, normalement sans Javadoc
	 * 
	 * @return
	 */
	public int getCarburant() {
		return this.carburant;
	}

	//(d'autres getters et setters)
	public int getCapacitePassagers() {
		return capacitePassagers;
	}

	public void setCapacitePassagers(int capacitePassagers) {
		this.capacitePassagers = capacitePassagers;
	}

	protected boolean verifierNom() {
		return this.nom != null;
	}

	protected boolean verifierCapacite() {
		System.out.println("Je vérifie la capacité, comme un avion simple");
		return this.capacitePassagers > 0;
	}
	
	/**
	 * Met à jour le carburant à sa capacité max.
	 */
	public void faireLePlein() {
		System.out.println("Le plein est fait");
		carburant = capaciteCarburant;
	}

	/**
	 * Ajoute carburant dans le réservoire de l'avion
	 * 
	 * @param carburant
	 */
	public void ajouterCarburant(int carburant) {
		System.out.println("Le plein est fait");
		this.carburant = carburant;
	}

	/**
	 * Fait voler l'avion, consomme du carburant
	 * 
	 * @param miles
	 * @param wind
	 */
	public void vole(int miles, boolean wind) {
		System.out.println("Je vole sur des miles");
		carburant = carburant - 10 * miles;
		carburant = wind ? carburant - 10 : carburant;
	}

	/**
	 * this (l'avion sur lequel on appelle la méthode) ravitaille autreAvion
	 * (autreAvion est le premier argument de la méthode).
	 * 
	 * @param autreAvion l'avion qu'on ravitaille
	 * @param montant    le montant transféré
	 */
	public void ravitailleAutre(Avion autreAvion, int montant) {
		this.carburant -= montant;
		autreAvion.carburant += montant;
		compteurDAvions++;
	}

	/**
	 * Une méthode statique d'accès au compteur d'avions
	 */
	public static int getCompteurDAvions() {
		return compteurDAvions;
	}

	/**
	 * Main est aussi une méthode statique, spéciale, car elle peut être appelée par
	 * la JVM si on précise la classe à démarrer dans la ligne de commande (ici :
	 * java Avion)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Super !");
	}

}