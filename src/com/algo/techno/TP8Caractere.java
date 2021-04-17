package com.algo.techno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TP8Caractere {

	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String nom,prenom;
	System.out.println("Taper votre nom");
	nom=br.readLine();
	System.out.println("Taper votre prenom");
	prenom=br.readLine();
	System.out.println("Votre nom complet est :" + nom + " "  +prenom);

	}

}
