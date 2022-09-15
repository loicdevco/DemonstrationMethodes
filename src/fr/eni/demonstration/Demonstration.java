/**
 * 
 */
package fr.eni.demonstration;

import java.util.Scanner;

/**
 * @author loict
 *
 */
public class Demonstration {

	public static void afficherInfo(String message) {
		System.out.println("######################################################");
		System.out.println(message);
		System.out.println("######################################################");

	}

	public static void afficherBonjour(int nombre) {
		afficherInfo("Affichage de 10 fois bonjour.");
		for (int i = 0; i > nombre; i++) {
			System.out.println("Bonjour");
		}
	}

	public static void afficherPairs(int nombre) {
		afficherInfo("Affichage des 10 premiers nombres pairs.");
		int compteur = 0;
		int i = 0;

		while (compteur != nombre) {
			if (i % 2 == 0) {
				System.out.println(i);
				compteur++;
			}
			i++;
		}
	}

	public static void afficherCouleur() {
		afficherInfo("Affichage des couleurs.");
		System.out.println("VERT");
		System.out.println("JAUNE");
		System.out.println("BLEU");
		System.out.println("ROUGE");
	}

	public static void main(String[] args) {
		afficherInfo("Demande de saisie d'un entier à un utilisateur");

		System.out.println("Veuillez faire un choix :");
		System.out.println("1- Afficher 10 fois bonjour.");
		System.out.println("2- Afficher les 10 premiers nombres pairs.");
		System.out.println("3- Afficher des couleurs.");
		System.out.println("Veuillez faire un choix :");

		Scanner scan = new Scanner(System.in);
		int saisie = scan.nextInt();

		if (saisie == 1) {
			afficherBonjour(10);
		}

		if (saisie == 2) {
			afficherPairs(10);
		}
		;
		if (saisie == 3) {
			afficherCouleur();
		}

	}

}
