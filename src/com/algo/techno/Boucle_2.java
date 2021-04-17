package com.algo.techno;

import java.util.Scanner;

public class Boucle_2 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int x,i,P,S,N;
		float Moy=0f;
		System.out.println("Donner un nombre Entier positive");
		N=clavier.nextInt();
		S=0;
		P=1;
		i=0;
		do {
			i=i+1;
			System.out.println("Saisir le nombre numero:"+i);
			x=clavier.nextInt();
			S=S+x;
			P=P*x;
		} while (i==N);
        S=S/N;
        System.out.println("La somme des nombres est:"+S);
        System.out.println("Le produit des nombres est:"+P);
        System.out.println("La moyenne est:"+Moy);
        clavier.close();
	}

}
