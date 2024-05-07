package com.bigcorp.formation.cours.avion;

public class ValiseDto {

	private float poids;
	private float longueur;
	private boolean avecRoulettes;
	private String marque;

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	public boolean isAvecRoulettes() {
		return avecRoulettes;
	}

	public void setAvecRoulettes(boolean avecRoulettes) {
		this.avecRoulettes = avecRoulettes;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
}
