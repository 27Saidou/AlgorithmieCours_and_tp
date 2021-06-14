package com.algo.techno;

public class ManagerApps {

	public static void main(String[] args) {
		Personne p1=new Developpeur("Informaticien");
		p1.setNom("Diallo");
		p1.setMail("al@yahoo.com");
		p1.setSalaire(30000);
		p1.setTelephone("77 123 25 24");
		p1.setId(01);
		System.out.println(p1.getSalaire());

	}

}
