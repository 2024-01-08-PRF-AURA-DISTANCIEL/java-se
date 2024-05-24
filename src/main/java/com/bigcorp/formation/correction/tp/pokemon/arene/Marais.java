package com.bigcorp.formation.correction.tp.pokemon.arene;

import com.bigcorp.formation.correction.tp.pokemon.Pokemon;

public class Marais extends Arene {
	
	public static final int DEGATS_UNIQUES = 20;
	public static final String LIBELLE_ATTAQUANT = "Le poison du marais";
	
	public Marais() {
		this.nom = "marais";
	}

	@Override
	public void effetUnique(Pokemon pokemon1, Pokemon pokemon2) {
	}

	@Override
	public void effetPermanent(Pokemon pokemon1, Pokemon pokemon2) {
		pokemon1.subit(5, LIBELLE_ATTAQUANT);
		pokemon2.subit(5, LIBELLE_ATTAQUANT);
	}

}
