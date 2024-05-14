package com.bigcorp.formation.correction.tp.dinosaure;

public class Triceratops extends Dinosaure {

	private int armure;

	public Triceratops(String nom, double masse, int armure) {
		super(true, nom, masse);
		this.armure = armure;
	}

	@Override
	public void attaque(Dinosaure autre) {
		System.out.println("Le dinosaure : "+ this.nom + " attaque : " + autre.nom);
		if (this.masse > autre.masse) {
			autre.vivant = false;
			System.out.println("Le dinosaure : "+ autre.nom + " meurt");
		} else if (this.masse < autre.masse) {
			this.vivant = false;
			System.out.println("Le dinosaure : "+ this.nom + " meurt");
		}
	}

	public int getArmure() {
		return armure;
	}

}
