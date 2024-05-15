package com.bigcorp.formation.cours.animal;

public class Pigeon extends Animal implements Volant {

	@Override
	public void vole() {
		System.out.println("Je vole vers d'autres horizons");

	}

	@Override
	public void manger() {
		System.out.println("Je mange des graines");

	}

}
