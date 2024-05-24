package com.bigcorp.formation.cours.dinosaure;

public class JungleDinosaures {

	public static void main(String[] args) {
		Tyrannosaurus chouchou = new Tyrannosaurus("Chouchou", 12_000, 32);
		Tyrannosaurus louloute = new Tyrannosaurus("Louloute", 13_000, 50);
		Triceratops titi = new Triceratops("Titi", 14_000, 40);
		Triceratops toto = new Triceratops("Toto", 15_000, 30);

		chouchou.attaque(titi);
		chouchou.attaque(louloute);
		titi.attaque(toto);
		louloute.attaque(toto);

		System.out.println("\r\n Résultat : ");
		System.out.println("Chouchou est vivant ? :" + chouchou.isVivant());
		System.out.println("Louloute est vivante ? :" + louloute.isVivant());
		System.out.println("Titi est vivant ? :" + titi.isVivant());
		System.out.println("Toto est vivant ? :" + toto.isVivant());
		
		ResumeDinosaure resumeChouchou = new ResumeDinosaure(chouchou.getNom(), chouchou.isVivant());
		afficheResume(resumeChouchou);
		
		ResumeDinosaureAvecRecord resumeChouchourecord =
				new ResumeDinosaureAvecRecord(chouchou.getNom(), chouchou.isVivant());
		afficheResumeVersionRecord(resumeChouchourecord);
	}
	
	public static void afficheResume(ResumeDinosaure resumeDinosaure) {
		System.out.println("J'affiche un résumé");
		System.out.println("Le dinosaure s'appelle : " 
					+ resumeDinosaure.getNom() 
					+ " et il est " + (resumeDinosaure.isVivant() ? "vivant":"mort"));
	}
	
	public static void afficheResumeVersionRecord(ResumeDinosaureAvecRecord resumeDinosaureAvecRecord) {
		System.out.println("J'affiche un résumé, grâce au record");
		System.out.println("Le dinosaure s'appelle : " 
					+ resumeDinosaureAvecRecord.nom()
					+ " et il est " + (resumeDinosaureAvecRecord.isVivant() ? "vivant":"mort"));
		System.out.println(resumeDinosaureAvecRecord);
	}

}
