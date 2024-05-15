package com.bigcorp.formation.cours.dinosaure;

/**
 * Classe abstraite, ne peut être implémentée. Base de la hiérarchie
 * des classes dinosaures.
 */
public abstract class Dinosaure {

	// Les attributs sont protected pour ques les classes
	//fillles puissent y accéder
	protected boolean vivant = true;
	protected String nom;
	// Masse en kilos
	protected double masse;
	
	/**
	 * Constructeur de dinosaure. Ne sera jamais appelé directement
	 * par un new (la classe est abstraite). MAIS est quand même utile
	 * car pourra être appelé par les constructeurs des classes filles
	 * @param vivant
	 * @param nom
	 * @param masse
	 */
	public Dinosaure(boolean vivant, String nom, double masse) {
		this.vivant = vivant;
		this.nom = nom;
		this.masse = masse;
	}
	
	public Dinosaure(String nom, double masse) {
		this.vivant = true;
		this.nom = nom;
		this.masse = masse;
	}

	/**
	 * Méthode abstraite : les classes filles DEVRONT
	 * l'implémenter
	 * @param autre
	 */
	public abstract void attaque(Dinosaure autre);

	//Ici, il y a des getters , mais pas de setters : 
	//Seule la classe Dinosaure et les classes filles
	//ont le droit de modifier ces attributs : ils sont encapsulés.
	public boolean isVivant() {
		return vivant;
	}

	public String getNom() {
		return nom;
	}

	public double getMasse() {
		return masse;
	}

}
