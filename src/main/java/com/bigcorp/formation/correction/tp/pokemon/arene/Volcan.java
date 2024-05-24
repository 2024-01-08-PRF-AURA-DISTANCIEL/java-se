package com.bigcorp.formation.correction.tp.pokemon.arene;

import com.bigcorp.formation.correction.tp.pokemon.Pokemon;

public class Volcan extends Arene {

	public static final int DEGATS_UNIQUES = 20;
	public static final String LIBELLE_ATTAQUANT = "L'éruption du volcan";

	public Volcan() {
		this.nom = "volcan";
	}

	@Override
	public void effetUnique(Pokemon pokemon1, Pokemon pokemon2) {
		pokemon1.subit(20, LIBELLE_ATTAQUANT);
		pokemon2.subit(20, LIBELLE_ATTAQUANT);
	}

	@Override
	public void effetPermanent(Pokemon pokemon1, Pokemon pokemon2) {

	}

}
