package com.algo.techno;

import java.util.Scanner;

public class TimaKoure {

	public static void main(String[] args) {
		int[]U=new int[2];
		int[]V=new int[3];
		Scanner clavier=new Scanner(System.in);
		System.out.println("Donner le nombre d'elements d'un vecteur");
		int N=clavier.nextInt();
		while (N<=0) {
			System.out.println("Ce nombre dois etre positif,Retapez le");
			N=clavier.nextInt();
			System.out.println("Donner tous les elements du premier vecteur");
			U[N]=clavier.nextInt();
			System.out.println("Donner tous les elements du second vecteur");
			V[N]=clavier.nextInt();
			int PROD=0;
			int I=1;
			while (I<=0) {
				PROD=PROD+U[I]*V[I];
				I=I+1;
				System.out.println("Le produit scalaire de deux vecteurs "+U+ " et "+V+" et"+PROD);
				clavier.close();
				/* claire.mercier@cooptalis.com */
			}
		}

	}

}
