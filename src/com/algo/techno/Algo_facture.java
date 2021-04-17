package com.algo.techno;

import java.util.Scanner;

public class Algo_facture {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		float prix_total,prix_de_kg;
		int nb_kg;
		System.out.println("Entrez le prix d'un kilogramme de choux");
		prix_de_kg=clavier.nextFloat();
		System.out.println("Entrez le nombre de kilogramme de choux");
		nb_kg=clavier.nextInt();
		prix_total=prix_de_kg*nb_kg;
		System.out.println("« Le prix total de l'\'achat est "+prix_total);
		clavier.close();
	}

}
