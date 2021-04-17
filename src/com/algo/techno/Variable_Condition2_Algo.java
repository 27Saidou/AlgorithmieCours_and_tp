package com.algo.techno;

import java.util.Scanner;

public class Variable_Condition2_Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrez les heures");
		int h=clavier.nextInt();
		System.out.println("Entrez les minutes");
		int m=clavier.nextInt();
		if(m==60) {
			m=0;
			h=h+1;
		}
		if(h==24) {
			h=0;
			
		}
		System.out.println("Dans une heure il sera "+h+ " heure(s) " +m+ " minute(s) ");
		clavier.close();

	}

}
