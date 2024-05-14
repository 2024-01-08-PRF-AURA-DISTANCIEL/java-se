/*
 * Exercice conditions
 * 
 * 1. Chercher le plus grand des 3 nombres saisie par l'utilisateur
 * 2. Afficher sur les nombres saisie sont pairs ou impairs
 * 3. Demander a l'utilisateur de saisir le numero d'un mois de l'annee
 * et afficher le nombre de jours correspondant au mois choisi (28/29) pour fevrier
 * indiquer un message d'erreur si le numero de mois n'est pas compris entre 1 et 12.
 */

package com.bigcorp.formation.correction.exercice;

import java.util.Scanner;

// Classe principale
public class ExerciceConditions {
	public static void main(String[] args) {
		// Récupération de deux variables a et b
		Scanner scannerClavier = new Scanner(System.in);
		System.out.println("Veuillez entrer un entier a");
		int a = scannerClavier.nextInt();
		scannerClavier.nextLine();
		System.out.println("Veuillez entrer un entier b");
		int b = scannerClavier.nextInt();
		scannerClavier.nextLine();
		System.out.println("Veuillez entrer un entier c");
		int c = scannerClavier.nextInt();
		scannerClavier.nextLine();

		// Chercher le maximum entre a et b (ne faîtes pas ça chez vous, il
		// y a beaucoup mieux en mode 'Programmation Orientée Objet')
		// et afficher le résultat
		int maxAB = a;
		if (b > a) {
			maxAB = b;
		}
		System.out.println("Le max de a,b vaut : " + maxAB);

		// Chercher le maximum entre a,b et c
		// et afficher le résultat
		int maxABC = a;
		if (b > a) {
			if (c > a) {
				maxABC = c;
			} else {
				maxABC = b;
			}
		} else {
			if (c > a) {
				maxABC = c;
			} else {
				maxABC = a;
			}
		}
		System.out.println("Le max de a,b,c vaut : " + maxABC);

		// Afficher si a est pair ou impair avec un switch
		switch (a % 2) {
		case 0:
			System.out.println("a est pair");
			break;
		default:
			System.out.println("a est impair");
		}

		// Afficher si a est pair ou impair avec une expression ternaire
		String message = a % 2 == 0 ? "a est pair" : "a est impair";
		System.out.println("Avec une expression ternaire : " + message);

		// Fermeture des ressources (il y a mieux pour ce faire, mais nous verrons cela
		// plus tard)
		scannerClavier.close();
	}
}