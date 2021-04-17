package com.bailo.gn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class ExampleOperateurLogique {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	
	System.out.println("Entrez la valeur de a");
	int a=Integer.parseInt(br.readLine()); 
	System.out.println("Entrez la valeur de b");
	int b=Integer.parseInt(br.readLine()); 
	System.out.println("Entrez la valeur de c");
	int c=Integer.parseInt(br.readLine()); 
	if(a==b || b==c) {
		System.out.println("deux valeurs sont aux moins identiques");
	}

	}

}
