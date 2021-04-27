package com.algo.techno;



public class Tri_Par_Selection_Algo {
public static void main(String[] args) {
	int[] tab = {-4, 1, 13, 4, 16, 2, 13, 14}; 
	int i,j,min;
	i=1;
	while (i<tab.length) {
		j=+1;
		min=i;
		while (j<tab.length) {
			if (tab[j]<tab[min]) {
			min=j;	
			}
			j=j+1;
		}
		if (min!=i) {
			tab[i]=tab[min];
		}
		i=i+1;
	}
	System.out.println(tab.length);
}
}
