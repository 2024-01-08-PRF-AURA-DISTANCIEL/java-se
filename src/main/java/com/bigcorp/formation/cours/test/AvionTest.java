package com.bigcorp.formation.cours.test;

import static com.bigcorp.formation.cours.avion.Avion.POIDS_MAX_AVION;

import com.bigcorp.formation.cours.avion.Aeroport;
import com.bigcorp.formation.cours.avion.Avion;
import com.bigcorp.formation.cours.avion.Fenetre;

public class AvionTest {
	
	private Fenetre fenetreAvion;
	protected com.bigcorp.formation.ecran.Fenetre fenetreEcran;

	public static void main(String[] args) {
		Avion avion = new Avion("coucou");
		Aeroport aeroport = new Aeroport();
		Fenetre fenetreDAvion = new Fenetre();
		
		// Quelques centaines de ligne de code plus
		
		com.bigcorp.formation.ecran.Fenetre fenetreDEcran = new com.bigcorp.formation.ecran.Fenetre();
		System.out.println(POIDS_MAX_AVION);
	}

}
