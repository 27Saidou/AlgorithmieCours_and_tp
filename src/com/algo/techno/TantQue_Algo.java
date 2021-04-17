package com.algo.techno;

import java.util.Scanner;

public class TantQue_Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Etes-vous marié ?");
		String rep1=clavier.nextLine();
		System.out.println("Avez-vous des enfants?");
		String rep2=clavier.nextLine();
		if (rep1=="Oui" && rep2=="Oui"||rep1=="Non"||rep2=="Non") {
			System.out.println("Vous etes marie");
		}else {
			System.out.println("Vous avez des enfants");
		}
	
	}

}
