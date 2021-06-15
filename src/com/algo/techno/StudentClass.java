package com.algo.techno;

public class StudentClass {
	int rollNum;
	   String studentName;
	   Address Studentaddr;

	   StudentClass(int roll, String name, Address hamdallaye){
	       this.rollNum=roll;
	       this.studentName=name;
	       this.Studentaddr = hamdallaye;
	   }
	   public static void main(String[] args) {
		Address ad=new Address(17,"Alpha", "Up", "Sinthian");
		StudentClass st=new StudentClass(55, "Saidou",ad);
		System.out.println(st.rollNum);
	       System.out.println(st.studentName);
	       System.out.println(st.Studentaddr.streetNum);
	       System.out.println(st.Studentaddr.city);
	       System.out.println(st.Studentaddr.state);
	       System.out.println(st.Studentaddr.country);
	}
}
