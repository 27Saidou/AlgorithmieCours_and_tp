package com.algo.techno;

import java.util.Scanner;

public class Rep_TantQue {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Voulez-vous du café O/N");
		String rep=clavier.nextLine();
	while (rep=="O"|| rep=="N") {
		System.out.println("Vous devez répondre par O ou N. Recommencez");
		rep=clavier.nextLine();
	}
	
	System.out.println("Saisie acceptée");
	}

}
