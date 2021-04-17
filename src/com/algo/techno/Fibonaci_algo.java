package com.algo.techno;

public class Fibonaci_algo {

	public static void main(String[] args) {
		System.out.println(Fibonacci(4));
	}

	/**
	 * Utilisation de la fonction de Fibonacci Algorithmie
	 * 
	 * @param n
	 * @return
	 */
	public static int Fibonacci(int n) {
		if (n < 1) {
			return 1;
		} else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}

}
