package com.algo.techno;

import java.util.Scanner;



public class Calcul_Notes_En_Algorithme {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int i,n,S;
		i=0;
		S=0;
        do {
			System.out.println("Notes etudiants est:"+i+1);
			n=clavier.nextInt();
			S=S+n;
			i=i-1;
			if(n==1) {
				System.out.println("Aucune note saisie");
			}else {
				System.out.println("La Moyenne de la classe vaut"+(S+1)/(i-1));
			}
		} while (true);
    
       
	}
	

}
