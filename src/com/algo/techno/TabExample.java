package com.algo.techno;

import java.util.Arrays;
import java.util.Scanner;

public class TabExample {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrer une valeur Entier");
		int n=clavier.nextInt();
		int []Tab=new int [n];
		System.out.println("Entrer la valeur du tableau");
		for (int i = 0; i <n; i++) {
			Tab[i]=clavier.nextInt();
		}
		System.out.println(Arrays.toString(Tab));
		clavier.close();

	}

}
