package com.bigcorp.formation.cours.animal;

public class ChauveSouris extends Animal implements Volant, EmetteurUltrason {

	@Override
	public void manger() {
		System.out.println("Je mange un papillon, grâce à mes ultrasons");
	}
	
	@Override
	public void vole() {
		System.out.println("Je vole, et j'utilise mes ultrasons");
	}

	@Override
	public void echoLocation() {
		System.out.println("J'envoie des ultrasons pour éviter de me prendre un arbre");
	}

}