package com.algo.techno;

import java.util.Scanner;

public class consultation_algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int[]T=new int[100];
		int N,P;
		N=-2;
		if (N==0) {
			System.out.println("le Tableau est vide");
		}else {
			System.out.println("Entrez l'indice du tableau a consulter");
			P=clavier.nextInt();
			if (P<1|| P>N) {
				System.out.println("Position hors limites du tableau");
			}else {
				System.out.println("l'element a consulter est:"+T[P]);
				clavier.close();
			}
		}

	}

}
