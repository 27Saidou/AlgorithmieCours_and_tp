package com.algo.techno;

import java.util.Scanner;

public class Tkougne_hawa {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int n;
		System.out.println("Entrez un nombre entre 1 et 3");
		n=clavier.nextInt();
		while (n<1||n>3) {
			System.out.println("Saisie erronée. Recommencez");
			n=clavier.nextInt();
		}
		System.out.println("la valeur chercher est"+n);
		clavier.close();
	}

}
