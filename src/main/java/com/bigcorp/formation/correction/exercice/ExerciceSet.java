/**
/**
 * Exercice Collections
 *
 * Creer une liste vide
 * Ajouter des elements de type String a cette liste
 * Inserer un element au debut de la liste
 * Afficher le nombre d'element contenu dans la liste
 * Afficher la liste
 * Modifier un element par une autre valeur
 * Parcourir la liste et afficher ses elements un par un
 * Supprimer un element de la liste et reafficher la liste
 */
package com.bigcorp.formation.correction.exercice;

// Classe principale

import java.util.HashSet;
import java.util.Set;


public class ExerciceSet {

    public static void main(String args[]) {
    	//Création d'un Set de Short
    	Set<Short> shortSet = new HashSet<>();
        // Ajout d'éléments, dont des doublons
    	shortSet.add((short)1);
    	shortSet.add((short)3);
    	shortSet.add((short)2);
    	shortSet.add((short)1);
        
        //Affichage de chaque élément du set
        for(Short element : shortSet){
            System.out.println("Le short vaut :  " + element);
        }

        // Affichage de la taille du set
        System.out.println("La taille du set vaut  : " + shortSet.size());
        
        // Vérification que le Set contient bien un élément
        System.out.println("Le set contient-il 2 ?  : " + shortSet.contains((short)2));

        // Suppression de cet élément
        shortSet.remove((short)2);
        
        // Vérification que le Set ne contient plus cet élément
        System.out.println("Le set contient-il 2 ?  : " + shortSet.contains((short)2));
        
    }   

}
