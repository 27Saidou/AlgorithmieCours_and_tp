package com.algo.techno;

import java.util.Scanner;



public class SecondCondition {

	private static final int PLUSGRAND = 0;

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Donner la valeur de x");
		int x=clavier.nextInt();
		System.out.println("Donner la valeur de y");
		int y=clavier.nextInt();
		System.out.println("Donner la valeur de z:");
		int z=clavier.nextInt();
		if (x>y) {
		    int PLUSGRAND=x;
			PLUSGRAND=y;
		}
		if(PLUSGRAND>z) {
			int PLUSGRAND=z;
		}else {
			System.out.println("Le plus grand de "+x+ +y+ "et "+z+" est "+PLUSGRAND);
		}

	}

}
