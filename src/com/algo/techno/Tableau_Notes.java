package com.algo.techno;

import java.util.Scanner;

public class Tableau_Notes {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int N[]=new int[30];
		int i;
		for (i = 0; i < N.length; i++) {
			System.out.println("Entrer la note N° "+i);
			N[i]=clavier.nextInt();
		}
		System.out.println(N[i]);
		clavier.close();

	}

}
