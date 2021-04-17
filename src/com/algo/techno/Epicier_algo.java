package com.algo.techno;

import java.util.Scanner;

public class Epicier_algo {
	public static final float TAXE=0186f;


	public static void main(String[] args) {
		
		Scanner clavier=new Scanner(System.in);
		float  prix_total_ht, prix_total, prix_du_kg ;
		int nb_kg ;
		System.out.println("'Entrez le prix d'un kilogramme de choux : ");
		prix_du_kg=clavier.nextFloat();
		System.out.println("Entrez le nombre de kilogramme de choux : ");
		nb_kg=clavier.nextInt();
		prix_total_ht=prix_du_kg*nb_kg;
		prix_total=prix_total_ht*(1+TAXE);
		System.out.println("L eprix de l'achat est:"+prix_total);
		clavier.close();
	}

}
