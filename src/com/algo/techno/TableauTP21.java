package com.algo.techno;

import java.util.Scanner;

public class TableauTP21 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		String nom[]=new String[40];
		int i;
		for(i=0;i<=39;i++) {
			System.out.println("nom etudiant"+i);
			String nom2=clavier.nextLine();
			System.out.println(nom[i]);
		}

	}

}
