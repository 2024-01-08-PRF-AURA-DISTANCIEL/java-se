package com.bigcorp.formation.correction.tp.pokemon;

import com.bigcorp.formation.correction.tp.pokemon.attaque.Battement;
import com.bigcorp.formation.correction.tp.pokemon.modele.TypePokemon;

public class Roucoul extends Pokemon {

	public Roucoul(Integer id, String nom) {
		super(id, nom, "Roucoul", 100, TypePokemon.AIR, new Battement());
	}

}
