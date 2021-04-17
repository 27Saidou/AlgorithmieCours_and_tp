package com.algo.techno;

import java.util.Scanner;

public class Nom_Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int n,m,i,j;
		System.out.println("Donnez la valeur de n");
		n=clavier.nextInt();
		System.out.println("Donnez la valeur de m");
		m=clavier.nextInt();
		int [][]T=new int[n][m];
		for (i = 1; i < T.length; i++) {
			for(j=1;j<=m;j++) {
				System.out.println("T["+i+","+j+"]=");
				T[i][j]=clavier.nextInt();
				System.out.println(T[i][j]);
				clavier.close();
			}
			
		}

	}

}
