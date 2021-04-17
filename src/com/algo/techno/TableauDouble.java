package com.algo.techno;

public class TableauDouble {

	public static void main(String[] args) {
		int[][] Tableau;
		int i, j;
		Tableau = new int[2][3];
		for ( i = 0; i < Tableau.length; i++) {
			for ( j = 0; j < Tableau[i].length; j++) {
				Tableau[i][j] = i + j;
				System.out.println(Tableau[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		 Tableau=new int[3][];
		 for (i = 0;  i< Tableau.length; i++) {
			 Tableau[i]=new int[i+1];
			 for (j = 0;  j< Tableau[i].length; j++) {
				Tableau[i][j]=i+j;
				System.out.println(Tableau[i][j]+" ");
			}
			 System.out.println();
			
		}
		 System.out.println();
	}

}
