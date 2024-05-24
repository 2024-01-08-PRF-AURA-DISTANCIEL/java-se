package com.bigcorp.formation.correction.tp.pokemon;

import com.bigcorp.formation.correction.tp.pokemon.attaque.Ecrasement;
import com.bigcorp.formation.correction.tp.pokemon.modele.TypePokemon;

public class Racaillou extends Pokemon {

	public Racaillou(Integer id, String nom) {
		super(id, nom, "Racaillou", 110, TypePokemon.INSECTE, new Ecrasement());
	}

}
