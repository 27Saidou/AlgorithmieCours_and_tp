package com.algo.techno;

import java.util.Scanner;



public class Algo_Moyenne {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrer la moyenne");
		int m=clavier.nextInt();
		if(m<8) {
			System.out.println("Recalé");
		}else if (m<=10) {
			System.out.println("Oral");
		}else if (m>=10) {
			System.out.println("Admis");
			clavier.close();
		}
	}

}
