package com.algo.techno;

import java.util.Scanner;

public class Algo_Calcul_PGDC {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int a;
		int b;
		System.out.println("Entrez le premier nombre");
		a=clavier.nextInt();
		System.out.println("Entrez la valeur de b");
		b=clavier.nextInt();
		while (a*b==0) {
			if (a>b) {
			a+=--b;
			}else {
				b=b-a;
			}
		}
		System.out.println("PGDC de a="+a+ " et PGDC b="+b);
		clavier.close();
	}

}
