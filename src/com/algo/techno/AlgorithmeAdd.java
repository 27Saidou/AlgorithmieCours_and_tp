package com.algo.techno;

import java.util.Scanner;

public class AlgorithmeAdd {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quel est la Multiplicande");
		int mucande = clavier.nextInt();
		System.out.println("Quel est le mulitplicateur ");
		int muteur = clavier.nextInt();
		while (mucande < 0 || muteur < 0) {
			System.out.println("Veuillez redonner deux nombres positifs");
			mucande = clavier.nextInt();
			muteur = clavier.nextInt();

		}
		int produit = 0;
		while (muteur > 0) {
			produit = produit + mucande;
			muteur = muteur - 1;
			System.out.println("Le produit de deux nombres est:" + produit);
		}
	}

}
