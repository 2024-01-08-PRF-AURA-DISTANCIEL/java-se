package com.bigcorp.formation.cours.dinosaure;

/**
 * Ceci est un POJO (Plain Old Java Object).
 * Il est très bête , ne contient pas de code fonctionnel,
 * mais contient des attributs, avec des getters/setters, 
 * ou un des getters ou un constructeur.
 */
public class ResumeDinosaure {

	private final String nom;
	private final boolean vivant;
	
	public ResumeDinosaure(String nom, boolean vivant) {
		super();
		this.nom = nom;
		this.vivant = vivant;
	}

	public boolean isVivant() {
		return vivant;
	}
	
	public String getNom() {
		return nom;
	}
	
}
