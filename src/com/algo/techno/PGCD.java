package com.algo.techno;

import java.util.Scanner;

public class PGCD {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int   A,B,X,Y,R;
		while (true) {
			System.out.println("Entrez la valeur de A:");
			A=clavier.nextInt();
			if (A>0) {
				break;
			}
		}
		while (true) {
			System.out.println("Entrez la valeur de B:");
			B=clavier.nextInt();
			if (B>0) {
				break;
			}
		}
		if(A>B) {
			X=A;
			Y=B;
		}else {
			X=B;
			Y=A;
		}
		while (X%Y!=0) {
			R=X%Y;
			 X=Y;
		     Y=R;
		}
		System.out.println("Le PGCD de "+A+" et "+B+"  vaut "+ Y);
		clavier.close();
	}

}
