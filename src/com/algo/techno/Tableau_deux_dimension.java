package com.algo.techno;

import java.util.Scanner;

public class Tableau_deux_dimension {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int T[][]=new int[1][10];
		
		float S,P,M;
		S=0;
		P=1;
		for (int i = 1; i <T.length; i++) {
		for (int j = 1; j <T.length; j++) {
				System.out.println("Entrez l'element du tableau"+T[i][j]);
				T[i][j]=clavier.nextInt();
				
			}
		}
       M=S/40;
       for (int i = 1; i <T.length; i++) {
		for (int j = 1; j < 4; j++) {
			System.out.println(T[i][j]);
		}
	}
       System.out.println("la somme des éléments du tableau est "+S);
       System.out.println("le produit des éléments du tableau est " + P);
       System.out.println("la moyenne  des éléments du tableau est " +M);
       clavier.close();
	}

}
