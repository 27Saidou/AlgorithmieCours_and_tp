package com.algo.techno;

import java.util.Scanner;

public class Trie_Croissant_Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		float T[]=new float[100];
		int n,i,j;
		j=2;
		n=1;
	    float aux;
	    if(n==0) {
	    	System.out.println("Le tableau est vide");
	    }else {
			for(i=1;i<n-1;i++) {
				for(j=i+1;j<n;j++) {
					if(T[i]>T[j]) {
						aux=T[i];
						T[i]=T[j];
						T[j]=T[i];
						T[j]=aux;
					}
				}
			}
			System.out.println(T[i]+""+T[j]);
			clavier.close();
		}

	}

}
