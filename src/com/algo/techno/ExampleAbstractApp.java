package com.algo.techno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleAbstractApp {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entrez la valeur de a");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Entrez la valeur de b");
		int b=Integer.parseInt(br.readLine());
		ExampleAbract e2=new Alpha();
		e2.addTwoEntier(a, b);
		System.out.println("La somme de"+a+" et "+b+" est ="+e2.addTwoEntier(a, b));
		ExampleAbract e4=new Alpha();
		System.out.println("La somme de ses trois valeurs est ="+e4.addThreeEntier(12, 12, 23));

	}

}

