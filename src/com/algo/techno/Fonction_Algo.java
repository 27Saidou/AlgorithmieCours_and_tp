package com.algo.techno;

public class Fonction_Algo {

	public static void main(String[] args) {
		Echanger(10, 15);
		

	}
	public static void Echanger(float A,float B) {
		float aux;
		aux=A;
		A=B;
		B=aux;
		System.out.println("La valeur de A="+A);
		System.out.println("La valeur de B="+B);
	}

}
