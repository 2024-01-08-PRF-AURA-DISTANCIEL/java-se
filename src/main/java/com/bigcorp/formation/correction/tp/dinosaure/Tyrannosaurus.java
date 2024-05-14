package com.bigcorp.formation.correction.tp.dinosaure;

public class Tyrannosaurus extends Dinosaure {

	private int forceAttaque;

	public Tyrannosaurus(String nom, double masse, int forceAttaque) {
		super(true, nom, masse);
		this.forceAttaque = forceAttaque;
	}

	@Override
	public void attaque(Dinosaure autre) {
		System.out.println("Le dinosaure : "+ this.nom + " attaque : " + autre.nom);
		if (autre instanceof Tyrannosaurus) {
			Tyrannosaurus autreTyrannosaurus = (Tyrannosaurus) autre;
			if (this.forceAttaque > autreTyrannosaurus.forceAttaque) {
				autreTyrannosaurus.vivant = false;
				System.out.println("Le tyrannosaure " + autreTyrannosaurus.nom + " meurt.");
			} else if (this.forceAttaque < autreTyrannosaurus.forceAttaque) {
				this.vivant = false;
				System.out.println("Le tyrannosaure " + this.nom + " meurt.");
			}
		} else if (autre instanceof Triceratops) {
			Triceratops autreTriceratops = (Triceratops) autre;
			if (this.forceAttaque > autreTriceratops.getArmure()) {
				autreTriceratops.vivant = false;
				System.out.println("Le triceratops " + autreTriceratops.nom + " meurt.");
			}
		}
	}

}
