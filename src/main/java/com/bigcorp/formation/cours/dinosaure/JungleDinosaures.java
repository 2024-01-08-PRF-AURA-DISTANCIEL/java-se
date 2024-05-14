package com.bigcorp.formation.cours.dinosaure;

public class JungleDinosaures {

	public static void main(String[] args) {
		Tyrannosaurus chouchou = new Tyrannosaurus("Chouchou", 12_000, 32);
		Tyrannosaurus louloute = new Tyrannosaurus("Louloute", 13_000, 50);
		Triceratops titi = new Triceratops("Titi", 14_000, 40);
		Triceratops toto = new Triceratops("Toto", 15_000, 30);

		chouchou.attaque(titi);
		chouchou.attaque(louloute);
		titi.attaque(toto);
		louloute.attaque(toto);

		System.out.println("\r\n Résultat : ");
		System.out.println("Chouchou est vivant ? :" + chouchou.isVivant());
		System.out.println("Louloute est vivante ? :" + louloute.isVivant());
		System.out.println("Titi est vivant ? :" + titi.isVivant());
		System.out.println("Toto est vivant ? :" + toto.isVivant());
	}

}
