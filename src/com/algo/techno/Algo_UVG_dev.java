package com.algo.techno;

import java.util.Scanner;

public class Algo_UVG_dev {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrez la longueur de X:");
		int x=clavier.nextInt();
		System.out.println("Entrez la largeur de Y:");
		int y=clavier.nextInt();
		int  a=x*y;
		System.out.println(a);
		clavier.close();

	}

}
