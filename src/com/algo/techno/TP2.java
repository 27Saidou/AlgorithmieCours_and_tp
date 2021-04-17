package com.algo.techno;

import java.util.Scanner;

public class TP2 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Taper dans l'ordre le premier,la raison,le nombre de termes");
		int Premier=clavier.nextInt();
		int raison=clavier.nextInt();
		int n=clavier.nextInt();
		int DERNIER=Premier+(n-1)*raison;
		int SOMME=(n*(2*Premier+(n-1)*raison))/2;
		System.out.println("La progression de " + n + " termes,de premier terme " + Premier+ " de Raison "+raison+ " a pour dernier terme " +DERNIER+ " et pour somme " +SOMME);
		clavier.close();

	}

}
