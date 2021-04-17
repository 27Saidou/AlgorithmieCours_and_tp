package com.algo.techno;

import java.util.Scanner;

public class Algorithme_Example_Taxe {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		long nb, pht, ttva, pttc ;
		System.out.println("Entrez le prix hors taxes :");
		pht=clavier.nextLong();
		System.out.println("Entrez le nombre d’articles :");
		nb=clavier.nextLong();
		System.out.println("Entrez le taux de TVA :");
		ttva=clavier.nextLong();
		pttc=nb*pht* (1 + ttva);
		System.out.println("Le prix toutes taxes est : "+pttc);
		clavier.close();

	}

}
