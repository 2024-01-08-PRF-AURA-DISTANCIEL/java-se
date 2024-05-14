package com.bigcorp.formation.cours.animal;

public class Zoo {

	public static void main(String[] args) {
		Chat toto = new Chat();
		toto.deplacer();
		toto.manger();
		
		Animal woofie = new PitBull();
		woofie.manger();
	}

}
