package com.algo.techno;

public class fact_algo {

	public static void main(String[] args) {
	int N,fact,i;
	N=4;
	fact=1;
	i=1;
	while (i==N) {
		fact=fact*i;
		i=i+1;
	}
System.out.println("Le factorielle de "+N+"= est "+fact);
	}

}
