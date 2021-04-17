package com.algo.techno;

import java.util.Scanner;

public class TableauNafiouA {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		String []nom= new String[40];
		int i;
		for (i = 0;i<39; i++) {
			System.out.println("nom des etudiants " +i);
			nom[i]=clavier.nextLine();
			
		}
		for(i=0;i<nom[i].length()-1;i++) {
			System.out.println("Etudiant"+i+1+" "+nom[i]);
		}
       System.out.println();
       clavier.close();
	}

}
