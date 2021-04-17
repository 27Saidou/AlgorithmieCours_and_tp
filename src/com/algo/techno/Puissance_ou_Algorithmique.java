package com.algo.techno;

import java.util.Scanner;

public class Puissance_ou_Algorithmique {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int N,p,R,i;
		
System.out.println("Ecrire la base de N:");
     N=clavier.nextInt();
     System.out.println("Ecrire L'exposant de P");
     p=clavier.nextInt();
     R=1;
     i=1;
     while (i<=p) {
    	 R=R*p;
    	 i=i+1;
		
	}
     System.out.println(N+ " ^ " +p+ " = " +R);
     
	}

}
