package com.algo.techno;

import java.util.Scanner;

public class Temp_Algo_Example {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrez la temperature de l'eau:");
		int temp=clavier.nextInt();
		if(temp<=0) {
			System.out.println("C'est la glace");
		}else if (temp<100) {
			System.out.println("C'est du liquide");
		}else {
			System.out.println("C'est de la vapeur");
			clavier.close();
		}
		
	}

}
