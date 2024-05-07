
package com.bigcorp.formation.exercices;

import java.util.Scanner;

// Classe principale
public class ExerciceExceptions2 {
	
	public static void main(String[] args) {
		System.out.println("Le résultat est : " + recuperationDonneesEtLanceCalcul());
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
		//Appeler ici prepareCalcul() et trouver un moyen de gérer au mieux
		//le problème
		return a + b;
	}
	
	public static void prepareCalcul() throws CalculException{
		throw new CalculException("Une erreur est survenue");
	}

}