package com.algo.techno;

import java.util.Scanner;

public class Fact_Alg {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Donner la valeur de N");
		int N=clavier.nextInt();
		int Fact=1;
		while (N>0) {
			Fact=Fact*N;
			N=N-1;
		}
		System.out.println("le Factorielle est:"+Fact);
		clavier.close();

	}

}
