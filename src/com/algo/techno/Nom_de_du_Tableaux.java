package com.algo.techno;

import java.util.Scanner;



public class Nom_de_du_Tableaux {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int N;
		System.out.println("Donner le nombre element du tableau");
		N=clavier.nextInt();
		while (N<=0) {
			System.out.println("Cette valeur n'est pas positive,Retapez-le");
			N=clavier.nextInt();
			int Tab[]=new int [N];
			System.out.println("Donner tous les elements du tableau");
			Tab[N]=clavier.nextInt();
			int Compte=0;
			int I=1;
			while (I<=0) {
				if (Tab[I]==0) {
				Compte=Compte+1;	
				}else {
					System.out.println("Rien");
					I=I+1;
				}
				System.out.println("il y a "+Compte+ "elements nuls dans le tableau"+Tab);
				clavier.close();
			}
		}
		

	}

}
