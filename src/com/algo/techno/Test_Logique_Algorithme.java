package com.algo.techno;

import java.util.Scanner;

public class Test_Logique_Algorithme {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrez la temperature de l'eau");
		int temp=clavier.nextInt();
		if(temp<=0) {
			System.out.println("C'est la glace");
		}
		if(temp>0|| temp<100) {
			System.out.println("C est du liquide");
		}
		if (temp>100) {
			System.out.println("C'est la vapeur");
		}
	}

}
