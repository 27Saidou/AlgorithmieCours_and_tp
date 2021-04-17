package com.algo.techno;

import java.util.Scanner;

public class Exampe_do_while {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int n;
		do {
			System.out.println("donnez un nb > 0 :");
            n=clavier.nextInt();			
		} while (n<=0);
		System.out.println("Le nombre est:"+n);
		clavier.close();
		
	}

}
