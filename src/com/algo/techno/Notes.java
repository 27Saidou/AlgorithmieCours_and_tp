package com.algo.techno;

import java.util.Scanner;

public class Notes {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int note;
		System.out.println("Entrez la note obtenu:");
		note = clavier.nextInt();
		switch (note) {
		case 0:
			System.out.println("Sans commentaire");
			break;
		case 1:
			System.out.println("Mauvaise");
			break;
		case 2:
            System.out.println("Prés de la Moyenne");
			break;
		case 3:
           System.out.println("Tu passes");
			break;
		case 4:
			System.out.println("Bon travail");
			break;
		case 5:
			System.out.println("Excellent");
			break;

		default:
			System.out.println("Note Improbable");
			break;
		}
      clavier.close();
	}
	public static int chercher(int x,int t[],int N) {
		int i;
		for (i = 0; i <N; i++) {
			if(x==t[i]) {
				return i;
			}
		}
		return -1;
	}

}
