package com.algo.techno;



public class Tierce_algorithmique {

	public static void main(String[] args) {
		System.out.print(fact(6));
        System.out.print("\n");
	}
	 public static int fact (int n) {
	        if (n==0) return(1);
	        else return(n*fact(n-1));
	    }
	

}
