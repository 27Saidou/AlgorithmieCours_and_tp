package com.algo.techno;


import java.util.Scanner;

public class Positif_ou_Negative {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int[]Liste=new int[6];
		int nbpos,nbneg,nbval,nb,i;
		
		System.out.println("Entrer le nombre de valeur a saisir");
		nbval=clavier.nextInt();
		for ( i = 0; i <nbval-1; i++) {
			System.out.println("Entrer un entier non null");
			nb=clavier.nextInt();
			Liste[i]=nb;
			
		}
		nbpos=0;
		nbneg=0;
		for(i=0;i<nbval-1;i++) {
			if(Liste[i]>0) {
				nbpos=nbpos+1;
				
			}else {
				nbneg=nbneg+1;
			}
		}
      System.out.println("Le nombre  de valeur positive est :"+nbpos);
      System.out.println("Le nombre de valeur negative est :"+nbneg);
	}

}
