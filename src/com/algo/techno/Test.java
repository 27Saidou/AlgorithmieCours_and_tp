package com.algo.techno;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Vector<String>v=new Vector<>();
		v.add("c++");
		v.add("java");
		v.add("Python");
		v.addElement("php");
		System.out.println("afficher les elements du vecteur est:"+v.firstElement());
		System.out.println("afficher l'occurence du dernier element java:"+v.lastIndexOf("java"));

	}

}
