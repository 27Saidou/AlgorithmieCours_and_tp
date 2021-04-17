package com.algo.techno;

import java.util.Scanner;

public class Boucle_N {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int i,n;
		System.out.println("Entrez la valeur de N");
		n=clavier.nextInt();
		for (i = 0;  i<10; i++) {
			System.out.println(i+ " fois "+n+ " est égal a "+i*n);
			clavier.close();
		}

	}

}
