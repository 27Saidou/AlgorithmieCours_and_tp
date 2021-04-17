package com.algo.techno;

import java.util.Scanner;

public class Temp_Maths_Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		boolean A,B;
		System.out.println("Entrez la temperature de l'eau:");
		int temp=clavier.nextInt();
		if (A=temp<=0) {
			System.out.println("C'est la glace");
		}else if (B=temp<100) {
			System.out.println("C'est du liquide:");
		}else {
			System.out.println("C'est la vapeur");
			clavier.close();
		}

	}

}
