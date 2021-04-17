package com.algo.techno;

import java.util.Scanner;

public class Rectangle_algorithmie {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int S,P;
		System.out.println("Entrez la longueur du rectangle:");
		int longueur=clavier.nextInt();
		System.out.println("Entrez la largeur du rectangle:");
		int largeur=clavier.nextInt();
		P=(longueur*largeur)/2;
		S=longueur*largeur;
		System.out.println("La Périmetre du rectangle est :"+P);
		System.out.println("La Surface du rectagle est :"+S);
		clavier.close();
	}

}
