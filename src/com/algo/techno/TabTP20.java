package com.algo.techno;
import java.util.Scanner;
public class TabTP20 {

	public static void main(String[] args) {
		int N;
		int Somme=0;
		int I=0;
		Scanner clavier=new Scanner(System.in);
		System.out.println("Taper le nombre d'elements du Tableau");
		N=clavier.nextInt();
		while (N<=0) {
			System.out.println("Redonner une valeur positive");
			N=clavier.nextInt();
			//on dois faire la declaration du tableau ici
			int Tab[]=new int[N];
			System.out.println("Donner tous les elements du tableau");
			Tab[N]=clavier.nextInt();
			while (I<=N) {
				Somme=Somme+Tab[I];
				I=I+1;
			
			}
			System.out.println("La somme des elements de "+Tab+"Vaut"+Somme);
			clavier.close();
		}	
		
	}

}
