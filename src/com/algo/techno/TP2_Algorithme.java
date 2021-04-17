package com.algo.techno;

import java.util.Scanner;

public class TP2_Algorithme {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrer la valeur de A");
		int a=clavier.nextInt();
		System.out.println("Entrez la valeur de B");
		int b=clavier.nextInt();
		int c=a+b;
		System.out.println("La somme des deux valeurs est:"+c);
		clavier.close();

	}

}
