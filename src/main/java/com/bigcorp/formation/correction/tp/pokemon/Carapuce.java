package com.bigcorp.formation.correction.tp.pokemon;

import com.bigcorp.formation.correction.tp.pokemon.attaque.Plouf;
import com.bigcorp.formation.correction.tp.pokemon.modele.TypePokemon;

public class Carapuce extends Pokemon {

	public Carapuce(Integer id, String nom) {
		super(id, nom, "Carapuce", 100, TypePokemon.EAU, new Plouf());
	}

}
