package com.bigcorp.formation.correction.tp.pokemon;

import com.bigcorp.formation.correction.tp.pokemon.attaque.Flameche;
import com.bigcorp.formation.correction.tp.pokemon.modele.TypePokemon;

public class Salameche extends Pokemon {

	public Salameche(Integer id, String nom) {
		super(id, nom, "Salameche", 100, TypePokemon.PLANTE, new Flameche());
	}

}
