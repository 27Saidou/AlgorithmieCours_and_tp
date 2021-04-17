package com.algo.techno;

import java.util.Scanner;

public class ExampleTP6 {

	public static void main(String[] args) {
		Scanner cl=new Scanner(System.in);
		int t1,t2,t3;
		int ech;
		System.out.println("Taper la valeur de t1:");
		t1=cl.nextInt();
		System.out.println("Taper la valeur de t2:");
		t2=cl.nextInt();
		System.out.println("Taper la valeur de t3:");
		t3=cl.nextInt();
		if(t1>t2) {
			ech=t1;
			t1=t2;
			t2=ech;
		}else if (t1>t3) {
			ech=t1;
			t1=t3;
			t3=ech;
		}else if (t2>t3) {
			ech=t2;
			t2=t3;
			t3=ech;
		}else {
			System.out.println("Rien");
		}
		System.out.println("Les tailles " +t1+ " cm " +t2+ "cm et " +t3+" cm sont ordonees");
	}

}
