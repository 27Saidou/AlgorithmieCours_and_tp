package com.algo.techno;
import java.util.Scanner;

public class AlgorithmeEtudiants {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		String[]nom=new String[40];
		int i;
		for(i=0;i<39;i++) {
			System.out.println("Taper nom etudaint"+i+1);
			nom[i]=clavier.nextLine();
		}
		

	}

}
