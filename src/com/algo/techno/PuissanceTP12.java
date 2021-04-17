package com.algo.techno;

import java.util.Scanner;

public class PuissanceTP12 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Taper la valeur de X:");
		int x=clavier.nextInt();
		System.out.println("Taper la valeur de N:");
		int n=clavier.nextInt();
		int expo=1;
		while (n>0) {
			expo=expo*x;
			n=n-1;
			System.out.println("Le resultat de calcul est:" +expo);
		}

	}

}
