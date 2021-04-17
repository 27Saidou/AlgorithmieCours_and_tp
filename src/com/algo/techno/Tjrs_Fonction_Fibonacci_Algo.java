package com.algo.techno;
public class Tjrs_Fonction_Fibonacci_Algo {

	public static void main(String[] args) {
		System.out.println(fibonacci(5));

	}
	public static int fibonacci(int nombre) {
		int res;
		if(nombre==1||nombre==0) {
			res=1;
		}else {

            res=fibonacci(nombre-1)+fibonacci(nombre-2);
		}
		return res;
	}

}
