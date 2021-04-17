package com.algo.techno;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

	public static void main(String[] args) {
		List<Books>list=new ArrayList<Books>();
		Books b1=new Books(101, "Diallo", "Alpha");
		Books b2=new Books(102, "Diallo", "Saidou");
		Books b3=new Books(103, "Diallo", "Massoud");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		for (Books b : list) {
			System.out.println(b.id+ " " +b.firstname+ " " +b.lastname);
		}
		

	}

}
