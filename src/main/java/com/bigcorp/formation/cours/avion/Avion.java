package com.bigcorp.formation.cours.avion;

public class Avion {

	public String nom;
	protected int capacitePassagers;
	String nomCompagnie;
	private int carburant;
	private int capaciteCarburant = 10_000;

	public void faireLePlein() {
		System.out.println("Le plein est fait");
		carburant = capaciteCarburant;
	}

	public int getCarburant() {
		return carburant;
	}

	public void vole(int miles, boolean wind) {
		System.out.println("Je vole sur des miles");
		carburant = carburant - 10 * miles;
		carburant = wind ? carburant - 10 : carburant;
	}
	
	public void ravitailleAutre(Avion autreAvion, int montant) {
		carburant -= montant;
		autreAvion.carburant += montant;
	}
	
}