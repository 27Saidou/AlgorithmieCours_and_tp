package com.algo.techno;

public class Algorithme2 {

	public static void main(String[] args) {
		int compte;
		int age=0;
		compte=0;
		for (int i = 1; i <10; i++) {
			compte=(compte+100+(2*age));
			System.out.println("Le compte de Marie au n-ième aniversaire est "+compte);
		}

	}

}
