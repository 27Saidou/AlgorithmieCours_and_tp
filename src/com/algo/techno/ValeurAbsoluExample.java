package com.algo.techno;

import java.util.Scanner;

public class ValeurAbsoluExample {

	public static void main(String[] args) {
		Scanner cl=new Scanner(System.in);
		System.out.println("Donner une valeur quelconque");
		int x=cl.nextInt();
		if(x!=0) {
			int y=x;
			y=-x;
			System.out.println("Le nombre de "+x+ " a pour valeur absolue"+y);
		}

	}

}
