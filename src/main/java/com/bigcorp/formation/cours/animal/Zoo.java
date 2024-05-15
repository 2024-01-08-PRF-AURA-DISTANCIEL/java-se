package com.bigcorp.formation.cours.animal;

public class Zoo {

	public static void main(String[] args) {
		Chat toto = new Chat();
		toto.deplacer();
		toto.manger();
		
		toto.miauler();
		
		Animal woofie = new PitBull();
		woofie.manger();
		toto.miauler(4);
		
		toto.miauler(1, "Miaou");
		
		ChauveSouris bernard = new ChauveSouris();
		Volant bernardVolant = bernard;
		Animal bernardAnimal = bernard;
		Object bernardObject = bernard;
		faisVoler(bernard);
		
		MicroChauveSouris jeannette = new MicroChauveSouris();
		ChauveSouris jeannetteChauveSouris = jeannette;
		Volant jeannetteVolant = jeannette;
		Animal jeannetteAnimal = jeannette;
		Object jeannetteObject = jeannette;
		faisVoler(jeannette);
	}
	
	public static void faisVoler(Volant v) {
		v.vole();
	}

}
