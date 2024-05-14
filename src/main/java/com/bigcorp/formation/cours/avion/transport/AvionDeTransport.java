package com.bigcorp.formation.cours.avion.transport;

import com.bigcorp.formation.cours.avion.Avion;

public class AvionDeTransport extends Avion {

	private int capaciteTonnes;
	private int tonnageEmbarque;

	public AvionDeTransport(String nom, int capaciteTonnesInitiale) {
		super(nom);
		this.capaciteTonnes = capaciteTonnesInitiale;
		this.tonnageEmbarque = this.capaciteTonnes;
	}

	public int calculePoidsAvion() {
		return tonnageEmbarque + carburant;
	}

	public void verifierTout() {
		verifierNom();
		verifierCapacite();
	}

	@Override
	public boolean verifierCapacite() {
		System.out.println("Je vérifie la capacité, comme un avion de transport");
		boolean capaciteAvionCorrecte = super.verifierCapacite();
		boolean capaciteTonnesCorrecte = this.capaciteTonnes > 0;
		return capaciteTonnesCorrecte && capaciteAvionCorrecte;
	}

	public boolean verifierCapacite(int capaciteMin) {
		return verifierCapacite() && this.capaciteTonnes > capaciteMin;
	}

	public int getCapaciteTonnes() {
		return capaciteTonnes;
	}

	public void setCapaciteTonnes(int capaciteTonnes) {
		this.capaciteTonnes = capaciteTonnes;
	}

	public int getTonnageEmbarque() {
		return tonnageEmbarque;
	}

	public void setTonnageEmbarque(int tonnageEmbarque) {
		this.tonnageEmbarque = tonnageEmbarque;
	}

}