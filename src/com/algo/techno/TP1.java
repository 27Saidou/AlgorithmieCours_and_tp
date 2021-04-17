package com.algo.techno;

import java.util.Scanner;

public class TP1 {

	public static void main(String[] args)  {
	Scanner clavier=new Scanner(System.in);
	int x,y,z;
	System.out.println("Taper la valeur de x");
	x=clavier.nextInt();
	System.out.println("Taper la valeur de y");
	y=clavier.nextInt();
	System.out.println("Taper la valeur de z");
	z=clavier.nextInt();
	int res=x+y+z;
	System.out.printf("La valeur cherchee est %d:",res);
	clavier.close();
	}

}
