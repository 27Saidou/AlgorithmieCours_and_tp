package com.algo.techno;

import java.util.Scanner;

public class Tableaux_algo {

	public static void main(String[] args) {
	 Scanner clavier=new Scanner(System.in);
	 int tableau[]=new int [100];
	int i,j,x;
	 boolean trouve ;
	 System.out.println("Entrez la valeur de X:");
	 x=clavier.nextInt();
	 i = 0;
	 j = 99;
	 trouve=true;
	 do {
		 trouve = ( tableau [ i ] == x ) ||( tableau [ j ] == x ) ;
		 i++;
		 j--;


	} while ( ! trouve && i <= j );
    System.out.println(trouve);
    clavier.close();
	}

}
