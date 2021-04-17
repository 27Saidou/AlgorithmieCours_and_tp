package com.algo.techno;

public class JavaSwapExample_Permutation {

	public static void main(String[] args) {
		int x=5;
		int y=10;
		permut(x, y);
	}
	private static void permut(int x,int y) {
		int temp=x;
		x=y;
		y=temp;
		System.out.println("Apres la permutation des variables suivants:");
		System.out.println("La valeur de X est:"+x);
		System.out.println("La valeur de Y est :"+y);
	}

}
