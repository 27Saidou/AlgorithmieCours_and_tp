package com.algo.techno;

class Teacher {
	   private String designation = "Professeur java";
	   private String collegeName = "NIIT";
	   public String getDesignation() {
		return designation;
	   }
	   protected void setDesignation(String designation) {
		this.designation = designation;
	   }
	   protected String getCollegeName() {
		return collegeName;
	   }
	   protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	   }
	   void does(){
		System.out.println("Enseignez");
	   }
	}