package com.algo.techno;

public class Approach_Algorithmic {

	public static void main(String[] args) {
		int count=0;
		int absent=0;
		int total=60;
		do {
			count=count+1;
			absent=total-count;
		} while (absent<0);
		System.out.println("Le nombre d'absent est:"+absent);

	}

}
