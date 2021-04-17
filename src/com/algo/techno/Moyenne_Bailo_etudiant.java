package com.algo.techno;

import java.util.Scanner;

public class Moyenne_Bailo_etudiant {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		int note;
		 System.out.printf("Entrez la note obtenue");
		 note=clavier.nextInt();
		 switch(note)
		 {
		 
		 case 0 :
			 System.out.println("Sans commentaire");
			 break;
		 case 1 : 
		System.out.println("Mauvais"); 
		break;
		 case 2 :
			 System.out.println("Près de la moyenne"); 
			 break;
		 case 3 : 
			 System.out.println("Tu passes"); 
			 break;
		 case 4 : 
			 System.out.println("Bon travail");
			 break;
		 case 5 : 
			 System.out.println("Excellent");
			 break;
		 default :
			 System.out.println("Note improbable"); break;
			
	}

}
}