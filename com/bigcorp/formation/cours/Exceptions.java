package com.bigcorp.formation.cours;

public class Exceptions {

	public static void main(String[] args) {
		//Appel de methode qui ne marche pas top
		//et utilisation des méthodes de l'exception
		
		//try catch de lecture de smon fichier
//		File monFichier = new File("mon-fichier.txt");
//		FileInputStream fileInputStream = null;
//			fileInputStream = new FileInputStream(monFichier);
//			byte[] fileBytes = fileInputStream.readAllBytes();
		
		//try with resources

	}
	
	public static void methodeQuiMarchePasTop() throws MonException{
		throw new MonException("Bon ben là, ça marche pas !" , true);
	}

}
