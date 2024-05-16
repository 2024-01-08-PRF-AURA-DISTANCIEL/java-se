package com.bigcorp.formation.cours;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions {

	public static void main(String[] args) {
		// Appel de methode qui ne marche pas top
		// et utilisation des méthodes de l'exception
		try {
			System.out.println("Je suis au début du try");
			methodeQuiMarchePasTop();
			System.out.println("Je suis à la fin du try");
		} catch (MonException e) {
			System.out.println("Je suis au début du catch");
			System.out.println(e.getMessage());
			System.out.println("La gravité vaut : " + e.isGrave());
		} finally {
			System.out.println("Ici, une ligne qui s'affiche tout le temps");
		}
		System.out.println("Je suis sorti du try/catch");

		// try with resources lisant un fichier.
		//Ici, on crée un fileInputStream , qui est automatiquement
		//fermé qu'une exception se produise, ou pas.
		File monFichier = new File("mon-fichier.txt");
		try(FileInputStream fileInputStream = new FileInputStream(monFichier)){
			//Copie d'un fichier dans un tableau d'octets
			byte[] fileBytes = fileInputStream.readAllBytes();
		} catch (IOException e) {
			System.out.println("Une erreur d'entrée/sortie s'est produite : " + e.getMessage());
		}


	}

	/**
	 * Méthode qui lance systématiquement une instance de MonException
	 * 
	 * @throws MonException
	 */
	public static void methodeQuiMarchePasTop() throws MonException {

		System.out.println("Je bosse");
		// calcul tres complique
		throw new MonException("Bon ben là, ça marche pas ", true);
	}

}
