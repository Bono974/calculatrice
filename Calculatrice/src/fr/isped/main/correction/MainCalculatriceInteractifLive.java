package fr.isped.main.correction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import fr.isped.calculatrice.correction.Calculatrice;



public class MainCalculatriceInteractifLive {

	public static void usage() {
		System.out.println("Entrez exactement 2 arguments de type entier séparés d'un espace");
	}

	public static void usageOperation() {
		System.out.println("Quelle opération souhaitez vous appliquer ? : add sub mul div");
	}

	public static void errorUsage() {
		System.out.println("Erreur : Entrez exactement 2 arguments de type entier séparés d'un espace");
	}

	public static void errorOperation(String op) {
		System.out.println("L'opération "+op+" n'existe pas.");
	}
	

	public static void main(String[] args){
		// Instancier une calculatrice
		Calculatrice casio = new Calculatrice();

		// Récupérer l'entrée standard
		Reader reader = new InputStreamReader(System.in);
		try {
			BufferedReader br = new BufferedReader(reader);
			String line = "begin";
			int resultat = -1;
			int a, b;

			// Boucle infinie
			usage();
			while((line = br.readLine()) != null) {

				String[] splittedArguments = line.split(" ");
				if (splittedArguments == null || splittedArguments.length != 2) {
					errorUsage();
					continue; // On recommence la boucle tant qu'on obtient pas exactement 2 arguments
				}

				a = Integer.parseInt(splittedArguments[0]);
				b = Integer.parseInt(splittedArguments[1]);

				// Boucle infinie pour récupérer l'opération à exécuter
				do {
					usageOperation();
					line = br.readLine();

					switch(line) {
					case "add":
						resultat = casio.additionner(a, b);
						break;
					case "sub":
						resultat = casio.soustraire(a, b);
						break;
					case "mul":
						resultat = casio.multiplier(a, b);
						break;
					case "div":
						resultat = casio.diviser(a, b);
						break;
					default:
						errorOperation(line);
						continue; // On recommence la 2e boucle tant qu'on obtient pas une opération
					}

					System.out.println("Voici votre résultat : " + resultat);
					break; // On sort de la 2e boucle, le résultat est affiché
				} while(line != null);
				usage();
			}
		}  catch (IOException e) {
			// Input erreur
		}
	}
}