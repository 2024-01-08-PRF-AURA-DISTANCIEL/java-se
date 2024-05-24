package com.bigcorp.formation.correction.tp.pokemon;

import com.bigcorp.formation.correction.tp.pokemon.modele.TypePokemon;

/**
 * Une promenade, peut plaire ou non à un Pokémon
 */
public class Promenade {
	
	private final TypePokemon typePokemonQuiApprecieLaPromenade;
	private final String nom;
	
	public Promenade(String nom, TypePokemon typePokemonQuiApprecieLaPromenade) {
		this.nom = nom;
		this.typePokemonQuiApprecieLaPromenade = typePokemonQuiApprecieLaPromenade;
	}

	public TypePokemon getTypePokemonQuiApprecieLaPromenade() {
		return typePokemonQuiApprecieLaPromenade;
	}

	public String getNom() {
		return nom;
	}
	
	

}
