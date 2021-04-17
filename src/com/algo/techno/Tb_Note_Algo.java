package com.algo.techno;

import java.util.Scanner;

public class Tb_Note_Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int[]Note=new int[11];
		int Moy,Som;
		for (int i = 0; i<11; i++) {
			System.out.println("Entrez la note n°"+i);
			Note[i]=clavier.nextInt();
			Som=0;
			Som=Som+Note[i];
			Moy=Som/12;
			System.out.println("Voici le resultat est :"+Moy);
		}

	}

}
