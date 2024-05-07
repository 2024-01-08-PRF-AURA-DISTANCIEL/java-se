package com.bigcorp.formation.cours;

public class MonException extends Exception {
	
	private boolean grave = true;

	public boolean isGrave() {
		return grave;
	}

	public MonException(String message, boolean grave) {
		super(message);
		this.grave = grave;
	}

}
