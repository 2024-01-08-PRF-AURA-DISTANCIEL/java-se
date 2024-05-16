
package com.bigcorp.formation.cours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UtilisationDeCollections {

    public static void main(String args[]) {
    	
    	//Initialisation des collections
    	Set<Integer> valeurs = new HashSet<>();
    	valeurs.add(1);
    	valeurs.add(3);
    	valeurs.add(5);
    	
    	List<String> listeCourse = new ArrayList<>();
    	listeCourse.add("stylo");
    	listeCourse.add("oranges");
    	listeCourse.add("salades");
    	
    	//Affichage de la valeur maximale :
    	System.out.println("La valeur maximale vaut : " + Collections.max(valeurs));

    	//Mélange de la liste des courses :
    	System.out.println("Avant mélange, la liste vaut : ");
    	for(String element : listeCourse) {
    		System.out.println(element);
    	}
    	System.out.println("Après mélange, la liste vaut : ");
    	Collections.shuffle(listeCourse);
    	for(String element : listeCourse) {
    		System.out.println(element);
    	}
        
    }
    
   

}
