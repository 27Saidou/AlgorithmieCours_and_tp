package com.algo.techno;

public class TodoAppAlgorithme {
public int PGCD(int a,int b) {
	while (b!=0) {
		if (a>b) {
			a=a-b;
		}else {
			b=b-a;
		}
		
	}
	return a;
}
public int Euclide(int a,int b) {
	while (b!=0) {
		int t=b;
		b=a%b;
		a=t;
		
	}
	return a;
}
public static void main(String[] args) {
	TodoAppAlgorithme a=new TodoAppAlgorithme();
	System.out.println(a.PGCD(21, 15));
	System.out.println(a.Euclide(90, 36));
}
}
