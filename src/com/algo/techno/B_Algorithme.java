package com.algo.techno;

import java.util.Scanner;

public class B_Algorithme {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int n1,n2,max;
		System.out.println("Entrez deux valeur n1 et N2");
		n1=clavier.nextInt();
		n2=clavier.nextInt();
		if(n1>n2) {
			max=n1;
		}else {
			max=n2;
		}
     System.out.println(" le plus grand est:"+ max);
     clavier.close();
	}

}
