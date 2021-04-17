package com.algo.techno;

public class Example_While {

	public static void main(String[] args) {
		final int N_MAX=4;
		final int F_Max=10;
		int n=2;
		while (n<=N_MAX) {
			int fact=1;
			System.out.println("Table\n");
			System.out.println(n);
			System.out.println(":");
			while (fact<=F_Max) {
				System.out.println(n*fact);
				System.out.println("");
				fact++;
			}
			System.out.println();
			n++;
		}

	}

}
