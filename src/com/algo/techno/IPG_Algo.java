package com.algo.techno;

import java.util.Scanner;

public class IPG_Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int  N, i, PG, IPG;
		PG=0;
		IPG=0;
		for(i=1;i<20;i++) {
			System.out.println("Entrez un nombre ");
			N=clavier.nextInt();
			if(i==1 || N>PG) {
				PG=N;
				IPG=i;
				
			}
			System.out.println("Le nombre le plus grand etait:"+PG);
			System.out.println("Il a été saisi en position numéro "+IPG);
			
		}

	}

}
