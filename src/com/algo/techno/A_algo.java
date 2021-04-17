package com.algo.techno;

import java.util.Scanner;

public class A_algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int nb,carr;
		System.out.println("Entrez un nombre");
		nb=clavier.nextInt();
		carr=nb*nb;
		System.out.println("le carré de ce nombre est:"+carr);
	}

}
