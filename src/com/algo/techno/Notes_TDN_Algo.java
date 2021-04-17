package com.algo.techno;

import java.util.Scanner;

public class Notes_TDN_Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int Notes[]=new int [11];
		int Moy,Som;
		for (int i = 0; i <11; i++) {
			System.out.println("Entrez la note n°"+i);
			Notes[i]=clavier.nextInt();
			Som=0;
			for (int J = 0; J < 11; J++) {
				Som+=Notes[i];
				Moy=Som/12;
				
			}
			System.out.println(Notes[i]);
			
		}
		
	}

}
