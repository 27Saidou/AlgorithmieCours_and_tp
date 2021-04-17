package com.algo.techno;

import java.util.Scanner;

public class Pair_algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int n;
		System.out.println("Entrez la valeur de n");
		n=clavier.nextInt();
		if(n%2==0) {
			System.out.println(n+ "test pair");
		}else if (n%2<=0) {
			System.out.println(n+"est Impair");
			clavier.close();
		}
		

	}

}
