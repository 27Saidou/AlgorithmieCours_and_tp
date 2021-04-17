package com.algo.techno;

import java.util.Scanner;

public class FactTP11 {
public static void main(String[] args) {
	Scanner clavier=new Scanner(System.in);
	System.out.println("Donner la valeur de N:");
	int n=clavier.nextInt();
	int fact=1;
	while (n>1) {
		fact=fact*n;
		n=n-1;
		System.out.println(fact);
	}
}
}
