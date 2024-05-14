package com.bigcorp.formation.cours.avion;

public class AvionMilitaire extends Avion {
	
	public AvionMilitaire(String nom) {
		super(nom);
	}

	private String nomDeCode;

	public String getNomDeCode() {
		return nomDeCode;
	}

	public void setNomDeCode(String nomDeCode) {
		this.nomDeCode = nomDeCode;
	}

}
