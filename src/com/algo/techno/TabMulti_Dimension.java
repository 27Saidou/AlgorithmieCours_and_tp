package com.algo.techno;
import java.util.Scanner;
public class TabMulti_Dimension {

	public static void main(String[] args) {
		
		int NL,NC;
		Scanner clavier=new Scanner(System.in);
		System.out.println("Donner la valeur de NL");
		NL=clavier.nextInt();
		System.out.println("Donner la valeur de NC");
		 NC=clavier.nextInt();
		while (NL<=0 || NC<=0) {
			System.out.println("Redonner des dimensions positives");
			NL=clavier.nextInt();
			NC=clavier.nextInt();
			final int [][]MAT=new int[NL][NC];
			System.out.println("Donner les elements du tableau");
			MAT[NL][NC]=clavier.nextInt();
			
		}
		 int SOM=0;
		 int L=1;
		while (L<=NL) {
			int C=1;
			while (C<=NC) {
				int [][]MAT=new int [L][C];
				 SOM=SOM+MAT[L][C];
				C=C+1;
				L=L+1;
				System.out.println("La somme des elements du tableau est " +MAT+ " est " +SOM);
				   clavier.close();
			}
		
			
		}
		
   
	}

}
