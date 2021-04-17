package com.algo.techno;

public class Note_ou_Algorithme {

	public static void main(String[] args) {
		int notes=10;
		switch (notes) {
		case 0:
			System.out.println("Ouch !!!");
			break;
		case 10:
			System.out.println("Vous avez juste la moyenne");
			break;
		case 20:
			System.out.println("Parfait");
			break;

		default:
			System.out.println("Il faut davantage travailer.");
			break;
		}
	}

}
