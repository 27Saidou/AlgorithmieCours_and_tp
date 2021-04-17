package com.algo.techno;

import java.util.Scanner;

public class Algorithme_caractere {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrez votre nom");
		String nom=clavier.nextLine();
		System.out.println("Votre nom est:"+nom);
		clavier.close();

	}

}
