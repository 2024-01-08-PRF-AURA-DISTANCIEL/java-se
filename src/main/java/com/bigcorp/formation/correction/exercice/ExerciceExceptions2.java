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
public class ExerciceExceptions2 {
	public static void main(String[] args) {
		try {
		System.out.println("Le résultat est : " + recuperationDonneesEtLanceCalcul());
		}catch(Exception e) {
			System.out.println("Bon, hé bien, ça n'a pas marché, la cause est : " + e.getMessage());
		}
	}

	public static int recuperationDonneesEtLanceCalcul() {
		// Récupération de deux variables a et b
		Scanner scannerClavier = new Scanner(System.in);
		System.out.println("Veuillez entrer un entier a");
		int a = scannerClavier.nextInt();
		scannerClavier.nextLine();
		System.out.println("Veuillez entrer un entier b");
		int b = scannerClavier.nextInt();
		scannerClavier.nextLine();
		int resultat = lanceCalcul(a,b);

		// Fermeture des ressources (il y a mieux pour ce faire, mais nous verrons cela
		// plus tard)
		scannerClavier.close();
		return resultat;
	}

	public static int lanceCalcul(int a, int b) {
		return lanceCalculPourDeVrai(a,b);
	}

	public static int lanceCalculPourDeVrai(int a, int b) {
		prepareCalcul();
		return a + b;
	}
	
	/**
	 * Prepare le calcul
	 * @throws CalculRuntimeException
	 */
	public static void prepareCalcul() throws CalculRuntimeException{
		throw new CalculRuntimeException("Une erreur est survenue");
	}

}