package com.bigcorp.formation.cours.dinosaure;

/**
 * Un Triceratops est un dinosaure.
 * Il a une armure et se comporte d'une certaine manière au combat.
 */
public class Triceratops extends Dinosaure {

	private int armure;

	public Triceratops(String nom, double masse, int armure) {
		super(true, nom, masse);
		this.armure = armure;
	}

	/**
	 * Ici, on utilise le polymorphisme : attaque permet
	 * d'attaquer tout type de Dinosaure. De plus, on peut
	 * accéder aux attributs protected de Dinosaure, puisque 
	 * l'on est dans une classe fille de Dinosaure.
	 */
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
