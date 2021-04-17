package com.algo.techno;

import java.util.Scanner;

public class Saisie_affichage_Algorithme {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int i,n;
		int []T=new int[100];
       System.out.println("Entrez les nombres d'elements du tableau");
       n=clavier.nextInt();
       for (i = 1; i <n; i++) {
    	   System.out.println("Entrez l'elements N°"+i);
    	   T[i]=clavier.nextInt();
		
	}
       System.out.println("element T["+i+"] est:"+ T[i]);
       clavier.close();
	}

}
