package com.algo.techno;

import java.util.Scanner;

public class Rep_Algorithmique {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Voulez vous un café ? (O/N");
		String rep=clavier.nextLine();
		if(rep=="O"||rep=="N") {
			System.out.println("Saisie Erronéé,Recommencez");
			rep=clavier.nextLine();
		}

	}

}
