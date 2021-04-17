package com.algo.techno;

public class Test4 {

	public static void main(String args[]) {
		int dim1[][] = new int[3][];
		dim1[0] = new int[4];
		dim1[1] = new int[9];
		dim1[2] = new int[2];

		int n1 = 0;
		int n2 = 0;
		System.out.println("n1 = " + n1 + " n2 = " + n2);
		n1 = n2++;
		System.out.println("n1 = " + n1 + " n2 = " + n2);
		n1 = ++n2;
		System.out.println("n1 = " + n1 + " n2 = " + n2);
		n1 = n1++; // attention
		System.out.println("n1 = " + n1 + " n2 = " + n2);
	}

}
