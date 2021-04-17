package com.algo.techno;

import java.util.Scanner;

public class Tab_Diamant_Algo {

	public static void main(String[] args) {
		boolean Trouve=true;
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrez la valeur à rechercher");
		int N=clavier.nextInt();
		int []Tab=new int[19];
		for (int i = 0; i <19; i++) {
		if (N==Tab[i]) {
			Trouve=true;
		}
		if(Trouve=true) {
			System.out.println("N fait partie du tableau");
		}else {
			System.out.println("N ne fait pas partie du tableau");
		}
		clavier.close();
		}

	}

}
