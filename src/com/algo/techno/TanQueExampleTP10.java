package com.algo.techno;

import java.util.Scanner;

public class TanQueExampleTP10 {

	public static void main(String[] args) {
		Scanner cl=new Scanner(System.in);
		System.out.println("Donner la valeur de N:");
		int n=cl.nextInt();
		int somme=0;
		int x=0;
		while (x<n) {
			x=x+1;
			somme=somme+x;
			System.out.println("La somme de " +n+ "Premiers Entier est "+somme);
		}
	}

}
