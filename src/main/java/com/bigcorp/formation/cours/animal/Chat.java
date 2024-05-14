package com.bigcorp.formation.cours.animal;

public class Chat extends Animal {

	@Override
	public void deplacer() {
		System.out.println("Je me déplace silencieusement, comme un chat");
	}
	
	@Override
	public void manger() {
		System.out.println("Je mange des trucs de chat");
	}

}
