package com.bigcorp.formation.cours;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		
		//Création d'un HashSet
		Set<String> chaines = new HashSet<>();
		
		//Ajout d'éléments
		chaines.add("Une nouvelle chaîne");
		String deuxiemeChaine = "Une deuxième chaîne";
		chaines.add(deuxiemeChaine);
		chaines.add("Une troisième chaîne");
		
		//Affichage de la taille
		System.out.println("La taille de chaines");
		System.out.println(chaines.size());
		
		//Affichage de tous les éléments de la collection
		System.out.println("Affichage de chaines");
		for (String chaine : chaines) {
			System.out.println(chaine);
		}
		
		//Suppression d'un élément
		chaines.remove(deuxiemeChaine);
		System.out.println("Affichage de chaines, après la suppression");
		for (String chaine : chaines) {
			System.out.println(chaine);
		}
		
		//Création et remplissage d'une liste
		List<String> maListe = new ArrayList<>();
		maListe.add("Entrée de la liste 1");
		maListe.add("Entrée de la liste 2");
		
		//Utilisation de la méthode addAll (qui vient de collection, donc
		//que l'on peut appliquer à toutes les collections), pour ajouter
		//tous les éléments de la liste dans le set
		chaines.addAll(maListe);
		System.out.println("Affichage de chaines, après l'ajout des éléments de la liste");
		for (String chaine : chaines) {
			System.out.println(chaine);
		}
		
	}

}
