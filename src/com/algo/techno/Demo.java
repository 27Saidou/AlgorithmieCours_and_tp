package com.algo.techno;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Entrez deux valeur float svp");
		Scanner clavier=new Scanner(System.in);
		double  double_val=clavier.nextFloat();
		int int_value=clavier.nextInt();
		System.out.println("le floating point value est " + double_val+ " et la valeur entier est: " + int_value);
		clavier.close();

	}

}
