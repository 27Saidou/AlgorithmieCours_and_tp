package com.algo.techno;

public class RecursiviteTP13 {

	public static void main(String[] args) {
		System.out.println(factoriel(5));
	}
	static int factoriel(int n) {
		if(n==0 || n==1) {
			return 1;
			
		}else {
			return n*factoriel(n-1);
		}
	}

}
