package com.bigcorp.formation.cours;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.bigcorp.formation.cours.avion.Avion;

public class LambdasEtStreams {

	public static void main(String[] args) {
		
		//Création d'une lambda et mise dans une variable de type
		//Consumer. Cela fonctionne car la lambda correspond EXACTEMENT
		//à la méthode unique de l'interface Consumer : accept
		//Toutefois, en général, on ne stocke pas une lambda
		Consumer<String> maPremiereLambda = (String s) -> {
			System.out.println("Je suis dans la lambda");
			System.out.println(s);
		};

		// Les quatre lambdas ci-dessous sont équivalentes
		//On utilise des règles pour racourcir els lambdas
		Consumer<Integer> maDeuxiemeLambda = (Integer s) -> {
			System.out.println(s);
		};
		Consumer<Integer> maDeuxiemeLambdaRaccourcie = (Integer s) -> System.out.println(s);
		Consumer<Integer> maDeuxiemeLambdaEncorePlusRaccourcie = (s) -> System.out.println(s);
		Consumer<Integer> maDeuxiemeLambdaEncorePlusPlusRaccourcie = s -> System.out.println(s);

		//Création d'une liste de noms
		List<String> listeDeNoms = new ArrayList<>();
		listeDeNoms.add("salut");
		listeDeNoms.add("ça va");

		//Utilisatoin de la méthode forEach (qui utilise un Consumer, et peut donc utiliser une lambda).
		System.out.println("Utilisation de la méthode forEach");
		listeDeNoms.forEach((String s) -> {
			System.out.println("Grace à ma lambda , j'affiche : " + s);
		});
		listeDeNoms.forEach(s -> System.out.println("Grace à ma lambda , j'affiche : " + s));

		//Création d'un set d'entiers
		Set<Integer> mesEntiers = new HashSet<>();
		mesEntiers.add(34);
		mesEntiers.add(3);
		mesEntiers.add(9);
		mesEntiers.add(8);

		//La lambda ci-dessous garde les entiers pairs,
		//les multiplie par deux, puis les affiche
		System.out.println("Utilisation de stream");
		mesEntiers
				.stream()
				.filter((Integer i) -> {
					return i % 2 == 0;
				})
				.map((Integer i) -> {
					return 2 * i;
				})
				.forEach((Integer i) -> {
					System.out.println(i);
				});

		//Ci-dessous on fait la même chose en raccourci
		mesEntiers
				.stream()
				.filter(i -> i % 2 == 0)
				.map(i -> 2 * i)
				.forEach(i -> System.out.println(i));

		//Ci-dessous on fait la même chose en raccourci
		List<Integer> mesEntiersFiltres = mesEntiers
				.stream()
				.filter(i -> i > 5)
				.collect(Collectors.toList());
		
		//Ci-dessous on fait la même chose avec une boucle for
		//(mais sans les trois ours)
		for (Integer i : mesEntiers) {
			if (i % 2 == 0) {
				int i2 = i * 2;
				System.out.println(i2);
			}
		}

		//Utilisation de anyMatch, qui renvoie un booléen si au moins
		//un élément du stream correspond au Predicate
		boolean maCollectionContientElle4 = mesEntiers.stream().anyMatch(i -> i == 4);
		
		//La ligne ci-dessus correspond au code ci-dessous
		boolean maCollectionContientElle4AvecUneBoucle = false;
		for (Integer integer : mesEntiers) {
			if(integer ==4) {
				maCollectionContientElle4AvecUneBoucle = true;
				break;
			}
		}

		

		// Création de streams d'un nouveau type avec map
		//On passe d'un stream d'avions
		//A un stream de String
		//Puis un String d'Integer
		Avion avion1 = new Avion("a");
		List<Avion> avions = new ArrayList<>();
		avions.add(avion1);
		avions.stream()
				.filter(avion -> avion.getCapacitePassagers() > 10)
				.map(avion -> avion.getNom())
				.map(s -> s.length())
				.forEach(i -> System.out.println(i));
	}

}
