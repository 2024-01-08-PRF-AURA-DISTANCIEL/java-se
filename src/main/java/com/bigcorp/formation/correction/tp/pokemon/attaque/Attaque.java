package com.bigcorp.formation.correction.tp.pokemon.attaque;

import com.bigcorp.formation.correction.tp.pokemon.modele.TypePokemon;

/**
 * Attaque de base. Contient les attributs et méthodes mutualisables pour tous
 * les Pokémons.
 */
public abstract class Attaque {

	private String nom;
	private Integer degats;
	private TypePokemon type;

	protected Attaque(String nom, Integer degats, TypePokemon type) {
		super();
		this.nom = nom;
		this.degats = degats;
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public Integer getDegats() {
		return degats;
	}

	public TypePokemon getType() {
		return type;
	}

	@Override
	public String toString() {
		return this.nom;
	}

}
