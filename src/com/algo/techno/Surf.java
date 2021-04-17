package com.algo.techno;

import java.util.Scanner;

public class Surf {

	public static void main(String[] args) {
		Scanner cl=new Scanner(System.in);
		System.out.println("Quelle est sa longueur");
		int longueur=cl.nextInt();
		System.out.println("Quelle est sa largeur");
		int largeur=cl.nextInt();
		int surf=longueur*largeur;
		System.out.printf("La surface du rectangle est "+surf);
		cl.close();

	}

}
