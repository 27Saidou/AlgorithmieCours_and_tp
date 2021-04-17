package com.algo.techno;

import java.util.Scanner;

public class TabAlgorithms {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		double[]numbers=new double[5];
		int n;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Entrer une valeur réel");
			numbers[i]=clavier.nextDouble();
			System.out.println("La valeur de "+numbers[i]+" ");
		}

	}

}
