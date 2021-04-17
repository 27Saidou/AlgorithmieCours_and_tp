package com.algo.techno;

import java.util.Scanner;

public class Operations_algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int A,B;
		int S,P,Df,Dv;
		System.out.println("Entrez la valeur de A:");
		A=clavier.nextInt();
		System.out.println("Entrez la valeur de B:");
		B=clavier.nextInt();
		S=A+B;
		P=A*B;
		Df=A-B;
		Dv=A/B;
		System.out.println("La somme est :"+S);
		System.out.println("A*B="+P);
		System.out.println("A-B="+Df);
		System.out.println("A/B="+Dv);
		clavier.close();

	}

}
