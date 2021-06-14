package com.algo.techno;

import java.util.Scanner;

public class Rep {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Voulez-vous du café?(O/N)");
		String rep=clavier.nextLine();
		if (rep=="O" && rep=="N") {
			System.out.println("Saisie erronnée. Recommencez");
			rep=clavier.nextLine();
		}
		clavier.close();
		
	}

}
