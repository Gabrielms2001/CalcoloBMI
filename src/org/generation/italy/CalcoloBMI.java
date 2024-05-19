package org.generation.italy;

import java.util.Scanner;

public class CalcoloBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scrivere un programma che, in base all'altezza e al peso di una persona, ne
		 * calcola l'indice di massa corporea (BMI). La formula per calcolarlo è:
		 * BMI=peso/(altezza*altezza) dove il peso è indicato in kg e l'altezza è
		 * indicata in m
		 */

		float bmi, peso, altezza;
		String risposta;
		Scanner sc = new Scanner(System.in);

		do {
			// Viene richiesto all'utente l'inserimento del peso
			System.out.print("Inserire peso in kg:");
			peso = sc.nextFloat();
			sc.nextLine();
			System.out.print("Inserire altezza in m:");
			altezza = sc.nextFloat();
			// formula per calcolare il BMI
			bmi = peso / (altezza * altezza);
			/*
			 * Controllare se il peso sia negativo, o se l'altezza sia negativa o maggiore
			 * di 2.50 m
			 */
			if (peso < 0 || altezza < 0 || altezza > 2.50)
				System.out.println("Errore, inserire nuovamente i dati");
			else {
				// Stampa il BMI
				System.out.print("il tuo BMI è " + bmi + " ");
				// Viene determinata la categoria del BMI e stampato il risultato corrispondente
				if (bmi < 16.00)
					System.out.println("Grave magrezza");
				else if (bmi >= 16.00 && bmi < 18.50)
					System.out.println("Sottopeso");
				else if (bmi >= 18.50 && bmi < 25.00)
					System.out.println("Normopeso");
				else if (bmi >= 25.00 && bmi < 30.00)
					System.out.println("Sovrappeso");
				else if (bmi >= 30.00 && bmi < 35.00)
					System.out.println("Obeso classe 1");
				else if (bmi >= 35.00 && bmi < 40.00)
					System.out.println("Obeso classe 2");
				else
					System.out.println("Obeso classe 3");
			}
			// Si richiede all'utente se vuole effettuare un altro calcolo
			System.out.println("Si vuole effettuare un altro calcolo?");
			// Viene letta la risposta dell'utente
			risposta = sc.next();
			// Si richiede una risposta che preveda "si" o "no"
			while (!(risposta.equals("si") || risposta.equals("no"))) {
				System.out.println("inserire si o no");
				risposta = sc.next();

			}
			// Il ciclo continua finché l'utente risponde "si"
		} while (risposta.equals("si"));

		System.out.println("Arrivederci");
		// Chiusura dello scanner
		sc.close();
	}

}
