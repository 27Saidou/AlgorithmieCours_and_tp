package com.algo.techno;

import java.util.Scanner;

public class AlgoTP15 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Indiquer le nombre de note a traiter");
		int nombre=clavier.nextInt();
		int sup10=0;
		int sup18=0;
		while (nombre>0) {
			System.out.println("Taper une notes");
			int note=clavier.nextInt();
			if (note>10) {
				sup10=sup10+1;
				if (note>18) {
				sup18=sup18+1;	
				}else {
					System.out.println("Rien");
				}
			}else {
				System.out.println("Rien");
				nombre=nombre-1;
			}
		}
     System.out.println("Le nombre de note superieur a 10 est" +sup10);
     System.out.println("Le nombree de note est superieur a 18 est "+sup18);
	}

}
