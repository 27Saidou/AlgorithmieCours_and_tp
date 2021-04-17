package com.algo.techno;

import java.util.Scanner;

public class Ajout_algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		float T[]=new float[100];
		int X;
		int N=0;
		String Rep;
		 System.out.println("Entrez la valeur de l'element a ajouter");
		 X=clavier.nextInt();
		 System.out.println("Confirmez par (O/N)");
		 Rep=clavier.nextLine();
		if(Rep=="O"||Rep=="N") {
			N+=1;
			T[N]=X;
			
		}else {
			System.out.println("impossible d'effectuez ses operations ");
		}

	}

}
