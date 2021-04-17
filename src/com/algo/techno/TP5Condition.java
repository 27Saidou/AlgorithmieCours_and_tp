package com.algo.techno;

import java.util.Scanner;

public class TP5Condition {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Donner la valeur de x");
		int x=clavier.nextInt();
		System.out.println("Donner la valeur de y");
		int y=clavier.nextInt();
		if (x>y) {
			int PLUSGRAND=x;
		}else {
			int PLUSGRAND=y;
			System.out.println("le plus grand de " +x+ " et de "+y+" est :"+PLUSGRAND);
		}

	}

}
