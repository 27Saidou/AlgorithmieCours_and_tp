package com.algo.techno;

import java.util.Scanner;

public class TP7 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Taper la valeur de X:");
		int x=clavier.nextInt();
		System.out.println("Donner la valeur de B:");
		int B=clavier.nextInt();
		System.out.println("Taper la valeur de C");
		int C=clavier.nextInt();
        int M=B*x+C;
        if(M>0) {
        	int Y=M;
        	Y=-M;
        	System.out.println("La valeur absolue de " +B+ "*" +x+ "+" +C+ " est :" +Y);
        	clavier.close();
        }
	}

}
