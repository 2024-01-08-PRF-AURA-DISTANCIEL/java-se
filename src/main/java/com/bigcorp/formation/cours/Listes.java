package com.bigcorp.formation.cours;

import java.util.ArrayList;
import java.util.List;

public class Listes {

	public static void main(String[] args) {
		List<String> maPremiereListe = new ArrayList<>();
		
		System.out.println("Taille de la liste : ");
		System.out.println(maPremiereListe.size());
		
		//Ajout d'un élément, à la fin de la liste
		maPremiereListe.add("Salut");		
		System.out.println("Taille de la liste après add : ");
		System.out.println(maPremiereListe.size());
		
		//Suppression d'un élément par son index
		maPremiereListe.remove(0);
		System.out.println("Taille de la liste après remove : ");
		System.out.println(maPremiereListe.size());
		
		maPremiereListe.add("Salut");		
		maPremiereListe.add("Coucou");
		maPremiereListe.add("C'est bien");
		maPremiereListe.add("Mouais");
		
		//Récupération d'un élément à son index
		System.out.println("Affichage de l'élément à l'index 0 : ");
		System.out.println(maPremiereListe.get(0));
		
		//Affichage de la liste
		System.out.println("Affichage de la liste : ");
		for (String elementDeLaListe : maPremiereListe) {
			System.out.println(elementDeLaListe);
		}
		
		
	}

}
