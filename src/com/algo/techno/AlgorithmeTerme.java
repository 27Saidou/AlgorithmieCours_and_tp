package com.algo.techno;

import java.util.Scanner;

public class AlgorithmeTerme {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Donner la valeur de U1:");
		int U1=clavier.nextInt();
		System.out.println("Donner la valeur de U2:");
		int U2=clavier.nextInt();
		System.out.println("Donner le numero du terme rechercee");
		int n=clavier.nextInt();
		while (n<=2) {
		System.out.println("Redonner une valeur superieur a 2");
		n=clavier.nextInt();
		}
		int compte=3;
		while (compte<=n) {
			int U=U1+U2;
			U1=U2;
			U2=U;
			compte=compte+1;
			System.out.println("Le " +n+ " ieme terme de la suite vaut" + U);
		}

	}

}
