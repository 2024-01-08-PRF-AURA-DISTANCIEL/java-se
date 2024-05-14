package com.bigcorp.formation.cours;

// Classe principale
public class Conditions {
	
	public static void main(String[] args) {
		short forceElephant = 12;
		short forceRhinoceros = 10;

		// if then else
		System.out.println("\r\nUtilisation de if");
		if (forceElephant > forceRhinoceros) {
			System.out.println("L'éléphant est plus fort que le rhinocéros");
		} else if (forceRhinoceros > forceElephant) {
			System.out.println("Le rhinocéros est plus fort que l'éléphant");
		} else {
			System.out.println("Le rhinocéros est aussi fort que l'éléphant");
		}

		// switch
		System.out.println("\r\nUtilisation de switch à l'ancienne");
		int valeur = 1;
		switch (valeur) {
		case 0:
			System.out.println("Valeur 0");
			break;
		case 1:
			System.out.println("Valeur 1");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("Valeur 2");
			break;
		default:
			System.out.println("Je ne connais pas la valeur");
			break;
		}

		// switch case avec blocs (plus besoin de break)
		System.out.println("\r\nUtilisation de switch avec des blocs");
		switch (valeur) {
		case 0 -> {
			System.out.println("Valeur 0");
		}
		case 1 -> {
			System.out.println("Valeur 1");
		}
		case 2, 3, 4 -> {
			System.out.println("Valeur 2, ou 3, ou 4");
		}
		default -> {
			System.out.println("Je ne connais pas la valeur");
		}
		}

		// Les switchs ci-dessus sont équivalents au if ci-dessous :
		if (valeur == 0) {
			System.out.println("Valeur 0");
		} else if (valeur == 1) {
			System.out.println("Valeur 1");
		} else if (valeur == 2 || valeur == 3 || valeur == 4) {
			System.out.println("Valeur 2, ou 3, ou 4");
		} else {
			System.out.println("Je ne connais pas la valeur");
		}

		// Switch case dont le résultat est stocké dans une variable avec yield
		System.out.println("\r\nUtilisation de switch avec un yield");
		int tailleDuPiedEnCm = 33;
		int pointure = switch (tailleDuPiedEnCm) {
		case 30, 31 -> {
			yield 41;
		}
		case 32, 33 -> {
			yield 42;
		}
		default -> {
			yield 45;
		}
		};
		
		// Condition ternaire
		System.out.println("\r\nUtilisation de Condition ternaire");
		System.out.println(forceElephant > forceRhinoceros ? "L'éléphant est plus fort"
				: "Le rhinocéros est plus fort");

		// Condition ternaire composée (pas forcément recommandée)
		System.out.println(forceElephant > forceRhinoceros ? "L'éléphant est plus fort"
				: forceRhinoceros > forceElephant ? "Le rhinocéros est plus fort" : "Les deux sont de force égale");

	}
}