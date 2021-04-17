package com.algo.techno;

public class Algo_Tjrs_Structure {

	public static void main(String[] args) {
		int c=Multiplier(12, 12);
		System.out.println(c);
		System.out.println(Diviser(12, 8));
		System.out.println(Puissance(4,4));
		System.out.println(PGCD(21,15));
	}
public static int Multiplier(int a ,int b) {
	int produit,i;
	produit=0;
	for (i = 1; i<a; i++) {
	produit+=b;	
	}
	return produit;
	
}
public static int Diviser(int a,int b) {
	int quotient;
	quotient=0;
	while (a>=b) {
		a=a-b;
		quotient+=1;
	}
	return quotient;
}
public static int Puissance (int a,int b) {
	int puis;
	puis=1;
	for (int i = 1; i < b; i++) {
		puis=puis*a;
		
	}
	return puis;
}
public static int PGCD(int a,int b) {
	while (a<=b) {
		if(a>b) {
			a=a-b;
		}else {
			b=b-a;
		}
		
	}
	return a;
}
}
