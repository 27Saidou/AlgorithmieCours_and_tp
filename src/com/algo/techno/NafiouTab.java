package com.algo.techno;

import java.util.Scanner;

public class NafiouTab {

	public static void main(String[] args) {
		int N;
		Scanner clavier=new Scanner(System.in);
		System.out.println("Donner le nombre d'element du tableau");
		N=clavier.nextInt();
		while (N<=0) {
			System.out.println("Cette valeur n'est pas positive,Retapez La");
			N=clavier.nextInt();
		}
       int []Tab=new int[N];
       System.out.println("Donner tous les elements du tableau");
       Tab[N]=clavier.nextInt();
       int Compte=0;
  	   int I=1;
       while (I<=N) {
		if (Tab[I]==0) {
			Compte=Compte+1;
		}else {
			System.out.println("Rien");
			I+=1;
		}
	}
       System.out.println("Il y a "+Compte+" elements nuls dans le tableau"+Tab);
       clavier.close();
	}

}
