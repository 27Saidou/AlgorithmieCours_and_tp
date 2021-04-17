package com.algo.techno;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String>b=new Vector<String>();
		b.add("Java");
		b.add("Python");
		b.add("C++");
		b.add("PHP");
		for (String s: b) {
			System.out.println(s);
		}

	}

}
