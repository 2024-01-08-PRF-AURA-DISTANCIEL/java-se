package com.bigcorp.formation.exercices;

import java.util.ArrayList;
import java.util.List;

public class ExerciceStreams {

	public static void main(String[] args) {

		// Création d'une liste d'Entreprises
		List<Entreprise> superList = new ArrayList<>();
		superList.add(new Entreprise(2000, "Nantes", true));
		superList.add(new Entreprise(4000, "Montpellier", true));
		superList.add(new Entreprise(5000, "Bordeaux", true));
		superList.add(new Entreprise(6000, "Lyon", false));
		superList.add(new Entreprise(7000, "Paris", true));
		superList.add(new Entreprise(1000, "Strasbourg", false));
		superList.add(new Entreprise(4000, "Metz", true));

		// Tous les exercices ci-dessous sont à faire avec Stream
		// Affichage des entreprises

		// Tri des entreprises par chiffre d'affaires décroissant

		// On n'affiche que les trois entreprises ayant le plus grand chiffre d'affaires
		
		// On n'affiche que les trois entreprises ayant le plus grand chiffre d'affaires, 
		// mais en ne prenant en compte que les entreprises actives
		
		//On n'affiche que l'entreprise ayant le plus petit chiffre d'affaires
		
		
		//Affichage uniquement des chiffres d'affaires (en utilisant mapToInt)
		
		//Calcul du chiffre d'affaires moyen
		
		//Calcul du chiffres d'affaires moyen d'entreprises actives

	}
}

class Entreprise {

	private int chiffreAffaires;
	private String ville;
	private boolean actif;

	public Entreprise(int chiffreAffaires, String ville, boolean actif) {
		super();
		this.chiffreAffaires = chiffreAffaires;
		this.ville = ville;
		this.actif = actif;
	}

	public int getChiffreAffaires() {
		return chiffreAffaires;
	}

	public void setChiffreAffaires(int chiffreAffaires) {
		this.chiffreAffaires = chiffreAffaires;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	@Override
	public String toString() {
		return "Entreprise [ville=" + ville + ", actif=" + actif + "]";
	}

}
