package com.bigcorp.formation.cours;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.bigcorp.formation.cours.avion.Avion;

public class Maps {

	public static void main(String[] args) {

		// Création de la map
		Map<String, Avion> monCatalogue = new HashMap<>();
		Avion avion1 = new Avion("Mon bel avion");

		// Ajout d'un élément par sa clé et sa valeur
		monCatalogue.put("aaaa", avion1);

		Avion avion2 = new Avion("Mon avion moins joli");
		// Ajout d'un élément par sa clé et sa valeur
		monCatalogue.put("zx51", avion2);

		// Supprime un élément
		monCatalogue.remove("aaaa");

		// Ne fait rien, mais ne lance pas d'erreur
		Avion avionSupprime = monCatalogue.remove("aa");
		if (avionSupprime != null) {
			System.out.println("J'ai bien supprimé de la map l'avion : " + avionSupprime.getNom());
		} else {
			System.out.println("Je n'ai rien supprimé");
		}

		System.out.println("Parcours des valeurs de la map, pour afficher les noms ");
		for (Avion avion : monCatalogue.values()) {
			System.out.println(avion.getNom());
		}

		System.out.println("Parcours des clés de la map, pour afficher les clés ");
		for (String cle : monCatalogue.keySet()) {
			System.out.println(cle);
			Avion avion = monCatalogue.get(cle);
			avion.getCompteurDAvions();
		}

		for (Entry<String, Avion> entry : monCatalogue.entrySet()) {
			System.out.println("La clé : " + entry.getKey() + " est associée à la valeur " + entry.getValue().getNom());
		}

	}

}
