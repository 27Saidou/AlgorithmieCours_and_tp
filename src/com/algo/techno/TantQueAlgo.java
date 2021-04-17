package com.algo.techno;

import java.util.Scanner;

public class TantQueAlgo {

	public static void main(String[] args) {
		int nbr=0;int i;
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrez un nombre Entier");
		nbr=clavier.nextInt();
		System.out.println("La  table de multiplication est:\n"+nbr);
		for(i=1;i<12;i++) {
			System.out.printf(" %d * %d = %d \n", nbr, i, nbr*i);
			clavier.close();
		}
     
	}

}
