package com.bigcorp.formation.correction.tp.pokemon.referentiel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bigcorp.formation.correction.tp.pokemon.Carapuce;
import com.bigcorp.formation.correction.tp.pokemon.Pokemon;
import com.bigcorp.formation.correction.tp.pokemon.Racaillou;
import com.bigcorp.formation.correction.tp.pokemon.Roucoul;
import com.bigcorp.formation.correction.tp.pokemon.Salameche;

/**
 * Référentiel de pokemon. Stocke les pokemon et offre
 * des services permettant de récupérer les pokemons et de 
 * les modifier.
 */
public class APIReferentiel {

	private int nextId = 1;
	private Map<Integer, Pokemon> pokemons = new HashMap<>();

	/**
	 * Initialise this avec des Pokemons
	 */
	public APIReferentiel() {
		Pokemon choupiPuce = new Carapuce(nextId++, "Choupipuce");
		pokemons.put(choupiPuce.getId(), choupiPuce);

		Salameche lea = new Salameche(nextId++, "Lea");
		pokemons.put(lea.getId(), lea);

		Racaillou theRock = new Racaillou(nextId++, "The Rock");
		pokemons.put(theRock.getId(), theRock);

		Roucoul oiseau = new Roucoul(nextId++, "Oiseau");
		pokemons.put(oiseau.getId(), oiseau);
	}

	/**
	 * Retourne tous les pokemons du référentiel.
	 * La liste est nouvelle : nous protégeons notre map
	 * interne de toute modification du client.
	 * @return
	 */
	public List<Pokemon> getAllPokemons() {
		return new ArrayList<>(this.pokemons.values());
	}

	/**
	 * Renvoie un pokemon par son id : peut renvoyer null.
	 * @param id
	 * @return
	 */
	public Pokemon getPokemonById(Integer id) {
		return this.pokemons.get(id);
	}
	
	/**
	 * Remplace un Pokemon dans la map. Ne fonctionne que
	 * si un pokemon avec l'id pokemon.getId() existe dans ce référentiel.
	 * @param pokemon
	 */
	public void replacePokemon(Pokemon pokemon) {
		if(this.pokemons.containsKey(pokemon.getId())) {
			this.pokemons.put(pokemon.getId(), pokemon);			
		}
	}

}
