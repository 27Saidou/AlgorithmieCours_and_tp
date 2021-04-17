package com.algo.techno;

import java.util.Scanner;

public class Boucle_Repeter {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		String rep;
		do {
			System.out.println("Aimez vous l’’algorithmique (o/n) ?");
			rep=clavier.nextLine();
			
		} while (rep=="o"||rep=="n");
		
	}

}
