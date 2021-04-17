package com.algo.techno;

import java.util.Scanner;

public class TableauxTP24 {

	public static void main(String[] args) {
		int N,i;
		Scanner clavier=new Scanner(System.in);
		System.out.println("Donner la valeur de N=");
		N=clavier.nextInt();
		int  T[]=new int[N];
		for ( i = 0; i < N; i++) {
			System.out.println("+T["+i+"]+");
			T[i]=clavier.nextInt();
			
			System.out.println(T[i]);
			
		}
		clavier.close();
	}

}
