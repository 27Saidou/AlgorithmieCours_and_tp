package com.algo.techno;

import java.util.Scanner;

public class Suite_Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int n,i;
		System.out.println("Entrez la valeur de n");
		n=clavier.nextInt();
		for (i = 1; i <10; i++) {
			System.out.println(i+" fois "+n+" est = a "+i*n);
			clavier.close();
			
		}

	}

}
