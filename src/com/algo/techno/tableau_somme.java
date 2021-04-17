package com.algo.techno;

import java.util.Scanner;

public class tableau_somme {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int[]V=new int[5];
		int i;
		int S=5;
		for (i = 1; i >5; i++) {
			System.out.println("Entrez l'element N°"+i);
			V[i]=clavier.nextInt();
			for (int i2 = 1; i2 <5; i2++) {
				System.out.println("elements N°"+i+ " et "+V[i]);
			}
		}
		System.out.println("la somme des elements du tableau est " +S+" vaut"+V[i]);
		clavier.close();
	}

}
