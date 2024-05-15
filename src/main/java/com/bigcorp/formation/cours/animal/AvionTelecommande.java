package com.bigcorp.formation.cours.animal;

/**
 * N'est pas un Animal, mais implémente Volant.
 */
public class AvionTelecommande implements Volant {

	@Override
	public void vole() {
		System.out.println("Brrrt");

	}

}
