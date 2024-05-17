/**
/**
 * Exercice Collections
 *
 * Creer une liste vide
 * Ajouter des elements de type String a cette liste
 * Inserer un element au debut de la liste
 * Afficher le nombre d'element contenu dans la liste
 * Afficher la liste
 * Modifier un element par une autre valeur
 * Parcourir la liste et afficher ses elements un par un
 * Supprimer un element de la liste et reafficher la liste
 */
package com.bigcorp.formation.correction.exercice;

import java.util.ArrayList;
import java.util.List;

public class ExerciceList {

	public static void main(String args[]) {
		// Déclaration d'une liste de Integer
		List<Integer> list = new ArrayList<>();
		// Ajout d'éléments
		list.add(5);
		list.add(4654);
		list.add(Integer.MAX_VALUE);

		// Ajout d'élément à un index donné
		list.add(0, Integer.MAX_VALUE);

		// Afficher la taille de la liste
		System.out.println("La taille de la liste vaut  : " + list.size());

		// Affichage de la liste (parcours de chaque élément)
		for (Integer integer : list) {
			System.out.println("L'élément de la liste vaut :  " + integer);
		}

		// Suppression d'un élément à un certain index
		list.remove(2);

		// Affichage de la liste (parcours de chaque élément)
		for (Integer integer : list) {
			System.out.println("L'élément de la liste vaut :  " + integer);
		}
		

	}

}
