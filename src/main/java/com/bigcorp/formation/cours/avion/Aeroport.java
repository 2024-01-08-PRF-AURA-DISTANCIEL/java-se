package com.bigcorp.formation.cours.avion;

public class Aeroport {

	public static void main(String[] args) {
		Avion avion1 = null;
		avion1 = new Avion("Super avion");
		avion1.faireLePlein();
		System.out.println("La valeur du carburant de l'avion");
		System.out.println(avion1.getCarburant());
		Avion.compteurDAvions = 1;
		
		avion1.vole(100, true);
		System.out.println("La valeur du carburant de l'avion");
		System.out.println(avion1.getCarburant());

		System.out.println("Le nom de l'avion 1 vaut : ");
		System.out.println(avion1.getNom());

		Avion avion2 = new Avion("Avion pas terrible");
		Avion.compteurDAvions = 2;
		System.out.println("Le nom de l'avion 2 vaut : ");
		System.out.println(avion2.getNom());
		
		System.out.println("Le compteur d'avion vaut : ");
		System.out.println(Avion.compteurDAvions);
		System.out.println(avion1.compteurDAvions);
		System.out.println(avion2.compteurDAvions);
		
	}

}
