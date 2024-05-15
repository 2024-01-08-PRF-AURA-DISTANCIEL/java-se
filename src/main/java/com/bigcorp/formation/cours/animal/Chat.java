package com.bigcorp.formation.cours.animal;

public class Chat extends Animal {

	private static final String MIAULEMENT = "Miaou";

	@Override
	public void deplacer() {
		System.out.println("Je me déplace silencieusement, comme un chat");
	}
	
	@Override
	public void manger() {
		System.out.println("Je mange des trucs de chat");
	}
	
	public void miauler() {
		miauler(1, MIAULEMENT);
	}
	
	public void miauler(int nombreDeMiaulements) {
		miauler(nombreDeMiaulements, MIAULEMENT);
	}
	
	public void miauler(int nombreDeMiaulements, String message) {
		for(int i=0;i< nombreDeMiaulements;i++) {
			System.out.println(message);			
		}
	}

}
