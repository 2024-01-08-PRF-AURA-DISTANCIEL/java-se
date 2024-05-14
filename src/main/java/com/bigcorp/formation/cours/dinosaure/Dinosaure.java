package com.bigcorp.formation.cours.dinosaure;

public abstract class Dinosaure {

	protected boolean vivant = true;
	protected String nom;
	// Masse en kilos
	protected double masse;
	
	public Dinosaure(boolean vivant, String nom, double masse) {
		this.vivant = vivant;
		this.nom = nom;
		this.masse = masse;
	}

	public abstract void attaque(Dinosaure autre);

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
