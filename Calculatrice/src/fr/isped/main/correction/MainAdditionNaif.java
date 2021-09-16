package fr.isped.main.correction;



public class MainAdditionNaif {
	public static void usage() {
		// Définir une notice d'utilisation
		System.out.println("Entrez au moins 2 arguments de type integer / entier");
	}

	public static void main(String[] args){
		// Tester si 'args' est non vide et qu'il y a exactemet 2 arguments
		if (args == null || args.length != 2) {
			// Sinon, afficher l'usage souhaité
			usage();
			System.exit(1);
		}
		
		// Récupérer 2 arguments de la ligne de commande
		String aa = args[0];
		String bb = args[1];

		// Parser les aguments en 'entier´ 
		int a = Integer.parseInt(aa);
		int b = Integer.parseInt(bb);
	
		// Additioner les 2 valeurs et afficher le résultat
		System.out.println(a + b);
	}
}