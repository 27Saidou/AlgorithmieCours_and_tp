package com.algo.techno;

import java.util.Scanner;

public class ExampleWhileTP9 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Donner la valeur de n:");
		int n=clavier.nextInt();
		int SOMME=0;
		while (n>0) {
			SOMME=n+1;
			n=n-1;
			System.out.println("La Somme est " + SOMME);
			
		}

	}

}
