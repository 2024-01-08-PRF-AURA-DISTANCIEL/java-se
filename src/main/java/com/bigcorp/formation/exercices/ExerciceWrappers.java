
package com.bigcorp.formation.exercices;

public class ExerciceWrappers {
	public static void main(String[] args) {
		
		//Boxing d'un boolean (true) en Boolean
		boolean monBooleen = true;
		Boolean monBooleanWrapper = Boolean.valueOf(monBooleen);
		
		//Création d'un int à partir d'une chaîne de caractères
		int intFromString = Integer.parseInt("3");
		
		//Passage de ce int en Integer 
		Integer integerFromString = intFromString;
		
		Integer a = 3;
		Integer b = 5;
		
		
		Integer soustraction = a - b; 
		Integer soustraction2 = Integer.valueOf(a.intValue() - b.intValue());
		

	}
}