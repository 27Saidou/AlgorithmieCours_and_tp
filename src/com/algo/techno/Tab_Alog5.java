package com.algo.techno;

import java.util.Scanner;

public class Tab_Alog5 {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int [][]X=new int [1][2];
		int i,j,val;
		val=1;
		
		for (i = 0; i <1; i++) {
			for (j =0; j<2; j++) {
				X[i][j]=val;
				val+=1;
				
			System.out.println(X[i][j]);
			clavier.close();
			}
		}
     
	}

}
