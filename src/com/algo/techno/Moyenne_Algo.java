package com.algo.techno;

import java.util.Scanner;

public class Moyenne_Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int Notes[]=new int [29];
		int c,i,m;
		c=30;
		System.out.println("permet de calculer la moyenne");
		for (i = 0;  i<30; i++) {
			System.out.println("notes"+Notes[i]);
			Notes[i]=clavier.nextInt();
			c+=Notes[i];
		}
       m=c/30;
       System.out.println("La moyenne est:"+m);
       clavier.close();
	}

}
