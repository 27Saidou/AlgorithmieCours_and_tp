package com.algo.techno;

import java.util.Scanner;

public class Calcul_volume_cylindre {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		float Pi = 3.141f;
		float base,volume,hauteur,rayon;
		System.out.println("Entrez la valeur du rayon de la base:");
		rayon=clavier.nextFloat();
		System.out.println("Entrez la hauteur du cylindre:");
		hauteur=clavier.nextFloat();
		base=3.141f*rayon*rayon;
		volume=base*hauteur;
		System.out.println("le volume du cylindre est:"+volume);
		clavier.close();
	}

}
