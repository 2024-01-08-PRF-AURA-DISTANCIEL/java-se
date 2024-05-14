package com.bigcorp.formation.cours;

import java.time.LocalDateTime;

// Classe principale
public class Boucles {
	public static void main(String[] args) {
		// Boucle for
		System.out.println("\r\n boucle for");
		for (int i = 1; i < 4_000; i++) {
			System.out.println(i);
		}

		// Boucle do ... while et while
		System.out.println("\r\n  boucle do while");
		int k = 3;
		do {
			System.out.println(k);
		} while (k < 0);

		System.out.println("\r\n  while");
		int j = 103;
		while (j < 100) {
			System.out.println(j--);
		}

		// Boucle while avec break et continue
		System.out.println("\r\n boucle while");
		boolean monBoolean = true;
		while (true) {
			System.out.println("Instruction 1");
			if (monBoolean) {
				break;
			}
			System.out.println("Instruction 2");
		}

		for (int i = 3; i < 10; i += 2) {
			if (i == 5) {
				continue;
			}
			System.out.println("I vaut : %1$+d".formatted(i) );
		}
		
		// String interpolation:Console.WriteLine($"Hello, {name}! Today is {date.DayOfWeek}, it's {date:HH:mm} now.");
		String interpolation = "Hello, %1$s! Today is %2$tA, it's %2$tH:%2$tM now.";
		System.out.println(interpolation.formatted("Mark", LocalDateTime.now()));
		
	}
}