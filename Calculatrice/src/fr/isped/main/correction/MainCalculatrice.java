package fr.isped.main.correction;

import fr.isped.calculatrice.correction.Calculatrice;



public class MainCalculatrice {

	public static void usage() {
		System.out.println("Entrez au moins 2 arguments de type integer / entier");
	}

	public static void main(String[] args){
		if (args == null || args.length != 2) {
			usage();
			System.exit(1);
		}
		
		// Instancier une calculatrice
		Calculatrice casio = new Calculatrice();
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		// Utiliser la calculatrice pour l'addition
		int resultat = casio.additionner(a, b);
		
		// Afficher le résultat
		System.out.println(resultat);
	}
}