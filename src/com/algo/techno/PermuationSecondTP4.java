package com.algo.techno;

import java.util.Scanner;

public class PermuationSecondTP4 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Taper la valeur de x");
		int x=clavier.nextInt();
		System.out.println("Taper la valeur de y");
		int y=clavier.nextInt();
		System.out.println("Taper la valeur de z");
		int z=clavier.nextInt();
		int ech=x;
		x=y;
		y=z;
		z=ech;
		System.out.printf("Apres permutation les nombres sont %d %d %d ",x,y,z);

	}

}
