package com.algo.techno;

import java.util.Scanner;

public class recherche_toutes_occurences_algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		float[]T=new float[100];
		int N,i;
		N=-2;
		float X;
		boolean Existe;
		if (N==0) {
			System.out.println("le Tableau est vide");
		}else {
			System.out.println("Entrer la valeur de l'élément à chercher");
			X=clavier.nextFloat();
			Existe=false;
			for(i=1;i<N;i++) {
				if (T[i]==X) {
					Existe=true;
					System.out.println("l'element à chercher apparait à la position:"+i);
				}
			}
			if (Existe==false) {
				System.out.println("l'element n'apparait pas dans ce tableau");
				clavier.close();
			}
		}
	}

}
