package com.bigcorp.formation.cours.avion;

import com.bigcorp.formation.cours.avion.transport.AvionDeTransport;

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

		AvionMilitaire avionMilitaire = new AvionMilitaire("Jet");
		avionMilitaire.getNomDeCode();

		System.out.println("Vérification de capacité pour un avion de transport : ");
		AvionDeTransport avionDeTransport = new AvionDeTransport("Avion de transport", 30);
		avionDeTransport.verifierCapacite();
		avionDeTransport.verifierCapacite(3);

		System.out.println("Vérification de capacité pour un avion de base : ");
		avion2.verifierCapacite();
		afficheAvion(avion2);
		afficheAvion(avionDeTransport);
		
		if (avionMilitaire instanceof AvionMilitaire) {
			System.out.println("La variable avionMilitaire est un AvionMilitaire");
		}
		if (avionMilitaire instanceof Avion) {
			System.out.println("La variable avionMilitaire est un Avion");
		}
		if (avionDeTransport instanceof Avion) {
			System.out.println("La variable avionDeTransport est un Avion");
		}

		Avion avionDeTransportCache = new AvionDeTransport("avion de transport", 10);
		if (avionDeTransportCache instanceof AvionDeTransport) {
			System.out.println("La variable avionDeTransportCache est du type AvionDeTransport");
		}
		
		if(avion2 instanceof AvionDeTransport) {
			AvionDeTransport avionDeTransportApresCast = (AvionDeTransport) avion2;
			avionDeTransportApresCast.calculePoidsAvion();
		}
		
		afficheAvion(avion2);
		afficheAvion(avionDeTransportCache);

	}

	public static void afficheAvion(Avion avion) {
		System.out.println("\r\nL'avion a le nom : "+ avion.getNom());
		if(avion instanceof AvionDeTransport) {
			AvionDeTransport avionDeTransport = (AvionDeTransport) avion;
			System.out.println("la capacité de l'avion vaut : "+  avionDeTransport.getCapaciteTonnes());
		}
	}

}
