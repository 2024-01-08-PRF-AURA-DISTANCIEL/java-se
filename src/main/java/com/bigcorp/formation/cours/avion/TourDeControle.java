package com.bigcorp.formation.cours.avion;

/**
 * Tour de contrôle, singleton, surveille
 * le trafic. 
 */
public class TourDeControle {
	
	public static final TourDeControle MON_INSTANCE_UNIQUE = new TourDeControle();
	
	private TourDeControle() {
		
	}
	
	public boolean peutAtterrir(Avion avion) {
		return true;
	}

}
