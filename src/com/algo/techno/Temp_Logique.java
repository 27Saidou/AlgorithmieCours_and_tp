package com.algo.techno;

import java.util.Scanner;

public class Temp_Logique {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrez la temperture de l'eau:");
		int temp=clavier.nextInt();
		if(temp<0) {
			System.out.println("C'est la glace");
		}else {
			if(temp<100) {
				System.out.println("C'est du liquide");
			}else {
				System.out.println("C'est du vapeur");
				clavier.close();
			}
		}
	}

}
