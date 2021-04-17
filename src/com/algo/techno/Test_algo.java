package com.algo.techno;

import java.util.Scanner;

public class Test_algo {

	public static void main(String[] args) {
		
		Scanner clavier=new Scanner(System.in);
		final int MIN_AGE=18;
		int[] list = new int[5];
        System.out.println("Entrez l'age de la personne:");
        for(int i=0;i<5;i++){
              list[i] = clavier.nextInt();
        }
        System.out.println("Resultat pour les admis:");
        for(int i=0;i<5;i++) { 
        if(list[i] >= MIN_AGE)
              System.out.println(i + "est admis");
        else
              System.out.println(i + " n'est pas eligible");
        }
		clavier.close();

	}

}
