package fr.isped.file;

import java.io.*;



public class MainFileCSV  {
	
	public static void read(String csvFile) {
		try {
			File file = new File(csvFile);
			FileReader fr = new FileReader(file); 		// FileReader pour lire des chaines de caractère

			BufferedReader br = new BufferedReader(fr); // Pour lire ligne par ligne/stream
			String line = "";
			String[] tempArr;
			
			String delimiter = ",";

			while((line = br.readLine()) != null) {		// Boucle infinie, récupère une ligne tant qu'on arrive pas au bout du fichier
				tempArr = line.split(delimiter);        // Split d'une ligne par le délimiteur du fichier CSV (, ;   \t)

				for(String tempStr : tempArr)
					System.out.print(tempStr + " ");

				System.out.println();
			}
			br.close();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String csvFile = "toto.csv";					// Chemin du fichier CSV à manipuler
		MainFileCSV.read(csvFile);
	}
}