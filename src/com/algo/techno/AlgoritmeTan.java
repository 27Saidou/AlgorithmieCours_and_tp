package com.algo.techno;

import java.util.Scanner;

public class AlgoritmeTan {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Donner la valeur de N:");
		int n=clavier.nextInt();
		int somme =n;
		while (n>1) {
			n=n-1;
			somme=somme+n;
			System.out.println("La Somme est: " +somme);
		}

	}

}
