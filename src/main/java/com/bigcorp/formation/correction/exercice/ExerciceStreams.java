package com.bigcorp.formation.correction.exercice;

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
		superList.stream().forEach((e) -> {
			System.out.println("L'entreprise est : " + e);
		});

		// Tri des entreprises par chiffre d'affaires décroissant
		superList.stream().sorted((e1, e2) -> {
			return e2.getChiffreAffaires() - e1.getChiffreAffaires();
		}).forEach(e -> System.out.println("L'entreprise est : " + e + " et a comme chiffre d'affaires : " + e
				.getChiffreAffaires()));

		// On n'affiche que les trois entreprises ayant le plus grand chiffre d'affaires
		superList.stream().sorted((e1, e2) -> {
			return e2.getChiffreAffaires() - e1.getChiffreAffaires();
		}).limit(3).
		forEach(e -> System.out.println("L'entreprise dans le top 3 est : " + e + " et a comme chiffre d'affaires : " + e
				.getChiffreAffaires()));
		
		// On n'affiche que les trois entreprises ayant le plus grand chiffre d'affaires, 
		// mais en ne prenant en compte que les entreprises actives
		superList.stream()
		.filter(e->e.isActif())
		.sorted((e1, e2) -> {
			return e2.getChiffreAffaires() - e1.getChiffreAffaires();
		}).limit(3).
		forEach(e -> System.out.println("L'entreprise dans le top 3 des actifs est : " + e + " et a comme chiffre d'affaires : " + e
				.getChiffreAffaires()));
		
		//On n'affiche que l'entreprise ayant le plus petit chiffre d'affaires
		System.out.println("L'entreprise avec le plus petit chiffre d'affaires est : " +  
		superList.stream()
		.sorted((e1, e2) -> {
			return e1.getChiffreAffaires() - e2.getChiffreAffaires();
		}).findFirst().get());
		
		
		//Affichage uniquement des chiffres d'affaires (en utilisant mapToInt)
		superList.stream().mapToInt(e -> e.getChiffreAffaires()).forEach((ca) -> System.out.println("Le chiffre d'affaires vaut : " + ca));
		
		//Calcul du chiffre d'affaires moyen
		System.out.println("La moyenne des chiffres d'affaires vaut : " + 
		superList.stream().mapToInt(e -> e.getChiffreAffaires()).average());
		
		//Calcul du chiffres d'affaires moyen d'entreprises actives
		System.out.println("La moyenne des chiffres d'affaires des entreprises actives vaut : " + 
		superList.stream().filter(e->e.isActif()).mapToInt(e -> e.getChiffreAffaires()).average());

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
