package com.algo.techno;

import java.util.Scanner;

public class Table_de_multiplication {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int nombre;
		int i;
		System.out.println("Entrez une table de multiplication: ");
		nombre=clavier.nextInt();
		for (i = 0; i<13; i++) {
			System.out.println(nombre+"*" +i+ " = " +nombre*i);
			clavier.close();
		}
		
	}

}
