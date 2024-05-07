package com.bigcorp.formation.cours.avion;

/**
 * Tour de contrôle, singleton, surveille
 * le trafic
 */
public class TourDeControle {
	
	/**
	 * La variable statique et final
	 * est la seule instance de TourDeControle
	 * qui puisse exister dans la JVM. Elle est public
	 * , et pourra être 'lue' par toute classe. Mais le caractère
	 * final, la rend non modifiable par ces classes.
	 */
	public static final TourDeControle SEULE_INSTANCE_POSSIBLE = new TourDeControle();
	
	/**
	 * Le constructeur en private nous assure
	 * que seule la classe pourra construire une 
	 * instance de TourDeControle
	 */
	private TourDeControle() {
		
	}

}
