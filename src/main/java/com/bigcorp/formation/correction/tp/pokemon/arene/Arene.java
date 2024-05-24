package com.bigcorp.formation.correction.tp.pokemon.arene;

import com.bigcorp.formation.correction.tp.pokemon.Pokemon;

/**
 * Classe abstraite représentant une arène.
 */
public abstract class Arene {

	protected String nom;
	
	/**
	 * Effet unique affectant pokemon1 et pokemon2 au début d'un combat
	 * @param pokemon1
	 * @param pokemon2
	 */
	public abstract void effetUnique(Pokemon pokemon1, Pokemon pokemon2);
	
	/**
	 * Effet permanent affectant pokemon1 et pokemon2 au début de chaque tour de combat
	 * @param pokemon1
	 * @param pokemon2
	 */
	public abstract void effetPermanent(Pokemon pokemon1, Pokemon pokemon2);
	
}
