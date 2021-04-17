package com.algo.techno;

import java.util.Scanner;

public class TP3 {

	public static void main(String[] args) {
	Scanner br=new Scanner(System.in);
	System.out.println("Taper la dividende et le deiviseur");
	int x=br.nextInt();
	System.out.println("Taper la valeur de y");
    int y=br.nextInt();
    int quotient=x/y;
    int reste=x-(y*quotient);
    System.out.println("La division de "+ x + " par "+ y+ " a pour quotient " + quotient+ " et pour reste " + reste);
	
	}

}
