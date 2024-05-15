/**
 * Exemple sur les tableaux
 */

package com.bigcorp.formation.cours;

// Classe principale
public class Tableaux {
	public static void main(String[] args) {
		// Declaration d'un tableau sans l'alimenter
		int[] monPremierTableauDEntiers = new int[4];

		// Affectation des valeurs a un tableau
		// Remarque : le premier indice du tableau est 0
		monPremierTableauDEntiers[0] = 3;

		// Boucle d'initialisation
		for (int i = 0; i < monPremierTableauDEntiers.length; i++) {
			monPremierTableauDEntiers[i] = i + 2;
		}

		// Affichage d'une valeur d'un tableau
		System.out.println("Le premier élément de mon tableau vaut : ");
		System.out.println(monPremierTableauDEntiers[0]);

		// Affichage d'une valeur non attribue d'un tableau (cela est egal a null)
		System.out.println("Le dernier élément de mon tableau vaut : ");
		System.out.println(monPremierTableauDEntiers[3]);

		Object[] tableauDObjets = new Object[3];
		System.out.println("Le premier élément de mon tableau d'objets vaut : ");
		System.out.println(tableauDObjets[0]);

		// Vouloir acceder a un index non inclus dans un tableau genere une exception
		// System.out.println(monPremierTableauDEntiers[4]);

		// Déclaration d'un tableau sans declarer son nombre d'elements et alimente
		// directement
		String[] tableauDeChaines = { "salut", "ça va ?", "bien" };
		System.out.println("tableauDeChaines a une longeur de : ");
		System.out.println(tableauDeChaines.length);

		// Parcours du tableau pour afficher les elements
		System.out.println("Je parcours mon tableau de chaînes de caractères ");
		for (int i = 1; i < tableauDeChaines.length; i++) {
			System.out.println("A l'index : " + i);
			System.out.println(tableauDeChaines[i]);
		}
		System.out.println("Je parcours mon tableau de chaînes de caractères avec foreach ");
		for (String chaine : tableauDeChaines) {
			System.out.println(chaine);
		}

		// Tableau a deux dimensions
		boolean[][] grilleDeTetris = new boolean[10][40];

		// Affichage des dimensions du tableau
		System.out.println("Le tableau contient : " + grilleDeTetris.length + " colonnes.");

		// Parcours du tableau pour initialiser le contenu.
		boolean valeurAt_5_12 = grilleDeTetris[5][12];
		grilleDeTetris[9][39] = true;
		for (int x = 0; x < grilleDeTetris.length; x++) {
			boolean[] colonne = grilleDeTetris[x];
			for (int y = 0; y < colonne.length; y++) {
				colonne[y] = true;
			}
		}

	}

}