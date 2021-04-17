package com.algo.techno;

import java.util.Scanner;

public class Boucle_3 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int x,n,p,s;
		float Moy;
		System.out.println("Donner le nombre Entier positif");
		n=clavier.nextInt();
		s=0;
		p=1;
		for (int i = 1; i <n; i++) {
			System.out.println("Saisir le nombre numero:"+i);
			x=clavier.nextInt();
			s=s+x;
			p=p*x;
		}
		Moy=s/n;
		System.out.println("La somme des nombres est:"+s);
		System.out.println("Le produit des nombres est:"+p);
		System.out.println("La moyenne est égal a:"+Moy);
		clavier.close();
	}

}
