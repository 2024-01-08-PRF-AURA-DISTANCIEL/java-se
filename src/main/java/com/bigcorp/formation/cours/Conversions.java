/**
 * Exemple sur les variables
 */

package com.bigcorp.formation.cours;

// Classe principale
public class Conversions {
    public static void main(String[] args) {
        // Conversion d'un int en double
    	int a = 3;
    	double maVariableFlottante = a;
    	
    	//Conversion d'un double en int
    	double pi = 3.14;
    	int piEntier = (int) pi;
    	System.out.println("Pi entier");
    	System.out.println(piEntier);
    	
    	//Conversion d'un short en int
    	short petiteValeur = 3;
    	int grandeValeur = petiteValeur;
    	
    	//Conversion d'un int en short
    	int autreGrandeValeur = 422_333_000;
    	
    	short autrePetiteValeur = (short) autreGrandeValeur;
    	System.out.println("Autre petite valeur");
    	System.out.println(autrePetiteValeur);
    	
    }
    
   
}