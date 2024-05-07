/**
 * Exemple sur les variables
 */

package com.bigcorp.formation.cours;

// Classe principale
public class VariablesSimples {
	public static void main(String[] args) {
		// Définition d'un int
		int maPremiereVariable = 0;
		System.out.println("Ma premiere variable");
		System.out.println(maPremiereVariable);

		// Assignation d'une valeur à l'int précédemment vu
		maPremiereVariable = 42;
		System.out.println("Ma premiere variable après modif");
		System.out.println(maPremiereVariable);

		// Définition et assignation en une ligne
		int maDeuxiemeVariable = 45;
		System.out.println("Ma deuxieme variable après modif");
		System.out.println(maDeuxiemeVariable);

		// Idem pour un float et un booléen
		double pi = 3.14;
		boolean condition = true;
		System.out.println("Condition");
		System.out.println(condition);

		// Affectation multiple
		int a,b,c;
		a = b = c = 3;

		// Operateur arithmetique simple avec définition
		int somme = a + b;
		System.out.println("Sommme");
		System.out.println(somme);

		// Operateur unitaire postfixe
		somme = somme + 1;
		somme++;
		System.out.println("Somme après opérateur unitaire postfixe");
		System.out.println(somme);

		// Operateur unitaire prefixe
		++somme;
		System.out.println("Somme après opérateur unitaire préfixe");
		System.out.println(somme);

		// Operateur binaire

		// Operateur de comparaison logique

		// Operateur de negation

		// L'opérateur ternaire

	}
}