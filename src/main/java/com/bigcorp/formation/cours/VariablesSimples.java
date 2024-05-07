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
		int a, b, c;
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
		boolean isTrue = false;

		// Operateur de comparaison logique
		int ageCapitaine = 19;
		boolean isCapitaineMajeur = ageCapitaine > 18;
		System.out.println("Capitaine majeur ");
		System.out.println(isCapitaineMajeur);

		// Operateur de negation
		boolean isCapitaineMineur = !isCapitaineMajeur;
		System.out.println("Capitaine mineur ");
		System.out.println(isCapitaineMineur);

		boolean isBateauEnBonEtat = true;
		boolean bateauPeutPartir = isCapitaineMajeur && isBateauEnBonEtat;
		System.out.println("Le bateau peut partir ");
		System.out.println(bateauPeutPartir);

		boolean avarieBateau = false;
		boolean coqueUsee = true;
		boolean operationDeMaintenanceNecessaire = avarieBateau || coqueUsee;
		System.out.println("Une opération de maintenance est nécessaire");
		System.out.println(operationDeMaintenanceNecessaire);

		boolean bonMoteur = false;
		boolean bonneVoile = true;
		boolean cordageAbime = true;
		boolean bonMat = false;
		boolean voilierEnBonEtat = (bonMat && !cordageAbime);
		boolean bateauDeCompetition = isCapitaineMajeur && (bonMoteur || voilierEnBonEtat);
		
		// L'opérateur ternaire
		int payeDuCapitaine = isCapitaineMajeur ? 10_000 : 5_000;
		//Le code ci-dessus est équivalent à celui ci-dessous
		if(isCapitaineMajeur) {
			payeDuCapitaine = 10_000;
		}else {
			payeDuCapitaine = 5_000;
		}
		
		boolean grandVent = false;
		System.out.println("Paye du capitaine");
		
		//Ci-dessous, code qui compile, mais peu lisible, donc à éviter
		int vitesseBateau = (voilierEnBonEtat && grandVent) || bonMoteur 
					? (isCapitaineMajeur ? 15:10) : 5;

	}

}