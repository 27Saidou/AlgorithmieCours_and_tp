package com.algo.techno;

import java.util.Scanner;

public class GratuicielTP25 {

	public static void main(String[] args) {
		int notes[]=new int[5];
		Scanner clavier=new Scanner(System.in);
		System.out.println("Nombre eleve");
		int nbre=clavier.nextInt();
		System.out.println("Entrez les notes");
		int somme=0;
		int top=0;
		
		for (int i = 1; i < nbre; i++) {
			notes[i]=clavier.nextInt();
			if (notes[i]>top) {
				top= notes[i];
				
			}
			somme=somme+notes[i];
		}
		for (int i = 1; i <nbre; i++) {
			System.out.println("Note:"+notes[i]);
			
		}
		System.out.println("Moyenne: " +somme/nbre);
		System.out.println("La meilleur note: " +top);
		clavier.close();
	}

}
