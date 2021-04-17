package com.algo.techno;

import java.util.Scanner;

public class Nombre_Occurence {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int tableau[]=new int [100];
		int i , x , occurrences ;
		System.out.println("Entrez votre valeur x:");
		x=clavier.nextInt();
		occurrences=0;
		for(i=0;i<100;i++) {
			if (x==tableau[i]) {
				occurrences+=tableau[i];
			}
		}
      System.out.println(i);
      clavier.close();
	}

}
