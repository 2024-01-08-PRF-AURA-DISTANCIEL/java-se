package com.bigcorp.formation.correction.exercice;

import java.util.Random;

// Classe principale
public class ExerciceTableaux {
	public static void main(String[] args) {

		// L'instruction ci-dessous génère un float aléatoire de 0 à 100.
		float randomFloat = new Random().nextFloat() * 100;

		// Créer un tableau de 10 floats
		float[] tableauFloat1 = new float[10];

		// Le remplir avec des float aléatoires
		for (int i = 0; i < tableauFloat1.length; i++) {
			tableauFloat1[i] = new Random().nextFloat() * 100;
		}

		// Afficher le résultat sur la console
		System.out.println("\r\nAffichage du tableau1");
		for (int i = 0; i < tableauFloat1.length; i++) {
			System.out.println(tableauFloat1[i]);
		}

		// Créer un nouveau tableau de 12 floats
		float[] tableauFloat2 = new float[12];

		// y copier les dix éléments du premier tableau.
		for (int i = 0; i < tableauFloat1.length; i++) {
			tableauFloat2[i] = tableauFloat1[i];
		}

		// Mettre deux nouveaux float aléatoires dans les deux dernières 'cases'
		tableauFloat2[10] = new Random().nextFloat() * 100;
		tableauFloat2[11] = new Random().nextFloat() * 100;
		// Afficher le nouveau tableau
		System.out.println("\r\nAffichage du tableau2");
		for (int i = 0; i < tableauFloat2.length; i++) {
			System.out.println(tableauFloat2[i]);
		}
	}

}