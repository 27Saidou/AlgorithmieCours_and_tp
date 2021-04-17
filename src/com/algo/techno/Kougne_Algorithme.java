package com.algo.techno;

import java.util.Scanner;

public class Kougne_Algorithme {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Voulez-vous du café ?(O/N)");
		String rep=clavier.nextLine();
		while (rep=="O" && rep=="N") {
			System.out.println("Vous devez repondre par O ou N,Recommencez");
			rep=clavier.nextLine();
		}
     System.out.println("Saisie accepté!!!!!!");
    clavier.close();
	}

}
