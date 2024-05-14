package com.bigcorp.formation.cours;

import java.util.Random;

public class StringsEtWrappers{
	
	public static void main(String[] args) {
        
        //Chaîne de caractère
		String maChaine = "Coucou";
		//Ceci équivaut à :
		String monAutreChaine = new String("Coucou");
		
		//Concaténation de chaîne de caractères 
		String maChaineAgrandie = maChaine + " ça va ? ";
		
		// Autoboxing
		Float monPremierFloat = 3.14f;
        
        // Unboxing
		Integer a = Integer.valueOf(3);
		Integer b = Integer.valueOf(4);
		
		//Ci dessous extraction des valeurs primitives avant addition
		int somme = a.intValue() + b.intValue();
		
		//Ci dessous, addition (directe) grâce à l'auto unboxing.
		Integer aPlusB = a + b;
		
		Integer sommeAsInt = Integer.valueOf(somme);
		
		//Les lignes ci-dessus, peuvent être
		//résumées à la ligne ci-dessous, grâce à l'auto unboxing et 
		//l'autoboxing
		int sommeAvecUnboxing = a + b;
        
        // Conversion d'une String en classe Float
		float pi = 3.14f;
		Float piAsFloat = Float.valueOf(3.14f);
		Float piAsFloat2 = Float.valueOf("3.14f");
		
		Integer i1 = Integer.valueOf(4);
		Integer i2 = Integer.valueOf(4);
		Integer i3 = Integer.valueOf(4);
		Integer i4 = Integer.valueOf(4);
		Integer i5 = Integer.valueOf(4);
		
		Integer i6 = Integer.valueOf(10);
		
		double piAsDouble = 3.14;
		
		double d;
		Double d2;
		
		Boolean b2;
		
		Random random = new Random();
		for(int i = 0; i < 10_000_000; i++) {
			//Je prends deux Floats au hasard
			float aleatoire1 = random.nextFloat();
			float aleatoire2 = random.nextFloat();
			//Je les additionne
			float addition = aleatoire1 + aleatoire2;
			//J'affiche les résultats sur la console
			System.out.println(addition);
			
		}
        
        // Conversion du float en String
		

        // Saisir au clavier et affecter la saisie a une variable
//		Scanner scannerClavier = new Scanner(System.in);
//		System.out.println("Veuillez entrer une chaîne de caractères");
//		String venantDuClavier = scannerClavier.nextLine();
//		System.out.println("La chaine de caractères vaut  " + venantDuClavier);
//        
        // Recuperer un double
		
		
	}
}