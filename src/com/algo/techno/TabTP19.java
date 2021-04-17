package com.algo.techno;

import java.util.Scanner;

public class TabTP19 {

	public static void main(String[] args) {
		int N,i;
		Scanner clavier=new Scanner(System.in);
		System.out.println("Donner le nombre element entre 1 a 100 ");
		N=clavier.nextInt();
		float T[]=new float[N];
		for (i = 1; i < N; i++) {
			System.out.println("Saisir le nombre réel non null"+i);
			//on dois lire T[i]
			T[i]=clavier.nextFloat();
			System.out.println(T[i]);
					
			
		}
		
      int pos=0;
      int neg=0;
      for (i = 1; i <N; i++) {
		if(T[i]>=0) {
			pos=pos+1;
		}else {
			neg=neg+1;
		}
	}
      System.out.println("Le nombre de valeur negative est :"+neg);
      System.out.println("Le nombre de valeur positive est :"+pos);
	}

}
