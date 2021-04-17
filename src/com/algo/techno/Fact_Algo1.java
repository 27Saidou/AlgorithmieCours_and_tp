package com.algo.techno;

import java.util.Scanner;

public class Fact_Algo1 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int n,i,F;
		
		System.out.println("Entrez un nombre");
		n=clavier.nextInt();
		for (i = 2; i <n; i++) {
			F=8;
			F=F*i;
			System.out.println("La factorielle est:"+F);
			clavier.close();
		}

	}

}
