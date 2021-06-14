package com.algo.techno;

public class JavaExample extends Teacher {
    String mainSubject="Porgrammation java";
	public static void main(String[] args) {
		JavaExample obJavaExample=new JavaExample();
		System.out.println(obJavaExample.getCollegeName());
		System.out.println(obJavaExample.getDesignation());
		System.out.println(obJavaExample.mainSubject);
		obJavaExample.does();
		

	}

}
