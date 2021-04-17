package com.algo.techno;

public class Populations_algo {

	public static void main(String[] args) {
		int annees,alpha,beta;
		alpha=10000000;
		beta=5000000;
		annees=0;
		while (beta<=alpha) {
			annees+=1;
			alpha+=500000;
			beta *=103;
			System.out.println("il faut " + annees + " années pour que la population de beta dépasse celle de alpha ");
		}
	}

}
