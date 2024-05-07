package com.bigcorp.formation.cours.avion;

public class Aeroport {

	public static void main(String[] args) {
		Avion avion1 = null;
		avion1 = new Avion();
		avion1.nom = "Super avion";
		avion1.faireLePlein();
		System.out.println("La valeur du carburant de l'avion");
		System.out.println(avion1.getCarburant());
		
		avion1.vole(100, true);
		System.out.println("La valeur du carburant de l'avion");
		System.out.println(avion1.getCarburant());

		System.out.println(avion1.nom);

		Avion avion2 = new Avion();
	}

}
