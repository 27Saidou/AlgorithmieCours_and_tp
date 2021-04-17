package com.algo.techno;

import java.util.Scanner;

public class Puissance_algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		float X,Y,P;
		System.out.println("Donner la valeur de X:");
		X=clavier.nextFloat();
		System.out.println("Donnez la valeur de Y:");
		Y=clavier.nextFloat();
		P=(X*Y);
		System.out.println("La puissance est:"+P);
		clavier.close();
	}

}
