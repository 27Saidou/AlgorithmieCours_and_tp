package com.algo.techno;

import java.util.Scanner;

public class Algorithme_4_Harmonique {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int n,i;
		int somme=0;
		System.out.println("Entrez la valeur du nombre entier");
		n=clavier.nextInt();
		for(i=1;i<=n;i++) {
			somme+=10/i;
			System.out.println("Le resultat est "+somme);
			clavier.close();
		}

	}

}
