package com.algo.techno;

import java.util.Scanner;

public class Max_Algo {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		float max,nb1,nb2,nb3;
		System.out.println("donner le premier nombre");
		nb1=clavier.nextFloat();
		System.out.println("donnez le second nombre");
		nb2=clavier.nextFloat();
		System.out.println("donner le troisieme nombre");
		nb3=clavier.nextFloat();
		if(nb1>nb2) {
			max=nb1;
		}else {
			max=nb2;
		}
		if(max==nb3) {
			max=nb3;
		}
		System.out.println("maximum"+max);
		clavier.close();
	}

}
