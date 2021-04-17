package com.algo.techno;

import java.util.Vector;

public class VectorExample2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.addElement(4);
		v.remove(2);
		System.out.println("Suppression de  l'entier 2:"+v);
		System.out.println(v);
	}

}
