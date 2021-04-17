package com.algo.techno;

import java.util.Scanner;

public class Demo_Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int N,i,Som;
		System.out.println("Entrez un nombre entier");
		N=clavier.nextInt();
		Som=0;
		for(i=1;i<=N;i++) {
			Som+=i;
			System.out.println(" La somme est:"+Som);
			clavier.close();
			
		}
      
	}

}
