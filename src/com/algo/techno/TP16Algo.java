package com.algo.techno;

import java.util.Scanner;

public class TP16Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Taper la valeur de X");
		int x=clavier.nextInt();
		System.out.println("Taper la valeur de Y:");
		int y=clavier.nextInt();
		 int CALCUL=1;
		 while (y!=0) {
			int q=y/2;
			int r=x-y*2;
			if (r==0) {
				x=x*x;
				y=y/2;
			}else {
				CALCUL=CALCUL*x;
				y=y-1;
			}
			System.out.println("Le resultat est :" + CALCUL);
		}

	}

}
