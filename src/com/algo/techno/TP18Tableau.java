package com.algo.techno;

import java.util.Scanner;





public class TP18Tableau {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Taper le nombre d'element dans le tableau");
		int N=clavier.nextInt();
		while (N<=0) {
			System.out.println("Redonner une Valeur positif");
			N=clavier.nextInt();
			int[]Tab=new int [2];
			System.out.println("Donner tous les elements du tableau");
			int SOMME=0;
			int I=1;
			while (I<=N) {
				SOMME=SOMME+Tab[I];
				I=I+1;
				System.out.println("La somme des elements de " +Tab+ " Vaut " + SOMME);
			}
			
			
		}

	}

}
