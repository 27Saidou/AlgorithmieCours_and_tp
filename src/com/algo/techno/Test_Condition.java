package com.algo.techno;

import java.util.Scanner;

public class Test_Condition {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrez la valeur de A");
		int a=clavier.nextInt();
		System.out.println("Entrez la valeur de B");
		int b=clavier.nextInt();
		if(a==b) {
			System.out.println("Erreur");
		
		}else {
			if(a>b) {
				System.out.println(a);
			}else if (a<b) {
				System.out.println(b);
				clavier.close();
			}
		}

	}

}
