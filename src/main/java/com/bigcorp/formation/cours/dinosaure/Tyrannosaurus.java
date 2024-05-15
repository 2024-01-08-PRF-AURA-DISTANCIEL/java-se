package com.bigcorp.formation.cours.dinosaure;
/**
 * Un Tyrannosaurus est un dinosaure.
 * Il a une forceAttaque et se comporte d'une certaine manière au combat.
 */
public class Tyrannosaurus extends Dinosaure {

	private int forceAttaque;

	public Tyrannosaurus(String nom, double masse, int forceAttaque) {
		super(true, nom, masse);
		this.forceAttaque = forceAttaque;
	}

	/**
	 * Ici, on utilise le polymorphisme : attaque permet
	 * d'attaquer tout type de Dinosaure. De plus, on peut
	 * accéder aux attributs protected de Dinosaure, puisque 
	 * l'on est dans une classe fille de Dinosaure.
	 * On utilise aussi des instanceof et des casts pour 
	 * écrire du code dépendant du type réel du Dinosaure attaqué.
	 */
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
