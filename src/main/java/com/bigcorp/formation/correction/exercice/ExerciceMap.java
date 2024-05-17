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

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class ExerciceMap {

    public static void main(String args[]) {
    	//Création d'une Map dictionnaire avec comme type de clé String et comme type de valeur String
         Map<String, String> dictionnaire = new HashMap<String, String>();
        // Ajout des définitions (dont un doublon).
        // La clé est le nom , la valeur est la définition
        dictionnaire.put("logis", "habitation humaine.");
        dictionnaire.put("automobile", "véhicule muni d'un moteur, qui fournit sa propre force motrice.");
        dictionnaire.put("orange", "agrume, fruit de l'oranger. A donné son nom à la couleur.");
        dictionnaire.put("orange", "MMmhh c'est bon les oranges.");
        
        // Affichage de la taille de la map
        System.out.println("La taille de la map vaut  : " + dictionnaire.size());
        
        //Affichage d'une définition d'un mot
        System.out.println("La définition d'automobile vaut : "  + dictionnaire.get("automobile"));
        
        //Affichage de chaque définition avec sa clé et sa valeur
        for(Entry<String, String>  entry : dictionnaire.entrySet()){
            System.out.println(entry.getKey() + " , définition : " + entry.getValue());
        }
        
        // Suppression d'un élément de la map
        dictionnaire.remove("orange");
        
    }

   

}
