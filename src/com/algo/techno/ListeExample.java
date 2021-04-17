package com.algo.techno;

import java.util.ArrayList;

public class ListeExample {

	public static void main(String[] args) {
		ArrayList<String>liste=new ArrayList<>();
		liste.add("un");
		liste.add("developpeur web");
		liste.add("programmeur");
		liste.add("testeur");
		liste.remove(0);
		for (String string : liste) {
			System.out.println(string);
		}
	}

}
