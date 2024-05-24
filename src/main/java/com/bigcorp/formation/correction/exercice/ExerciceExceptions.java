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

import com.bigcorp.formation.exercices.CalculException;

// Classe principale
public class ExerciceExceptions {
	public static void main(String[] args)  {
		int resultat = 0;
		try {
			resultat = calcule(4, 5);
			System.out.println("Le résultat est : " + resultat);
		} catch (CalculException e) {
			System.out.println("Impossible de calculer le résultat : " + e.getMessage());
		}
		System.out.println("Je lance un autre calcul qui n'a rien à voir.");
	}

	
	public static int calcule(int a, int b) throws CalculException{
		throw new CalculException("Une autre erreur est survenue");			
	}

}