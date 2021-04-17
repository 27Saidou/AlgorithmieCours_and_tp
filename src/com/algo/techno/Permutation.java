package com.algo.techno;


import java.util.Scanner;


public class Permutation {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Donner la valeur de x");
		int x=clavier.nextInt();
		System.out.println("Donner la valeur de y");
		int y=clavier.nextInt();
		int ech=x;
		x=y;
		y=ech;
		System.out.printf("La valeur de x=%d et la valeur de y=%d\n",x,y);

	}

}
