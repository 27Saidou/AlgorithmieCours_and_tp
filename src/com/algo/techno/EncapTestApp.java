package com.algo.techno;

public class EncapTestApp {

	public static void main(String[] args) {
		EncapsulationDemo ec=new EncapsulationDemo();
		ec.setEmpName("Nafiou");
		ec.setEmpAge(23);
		ec.setSsn(112233);
		System.out.println("Votre nom est " +ec.getEmpName());
		System.out.println("votre Ssn est " +ec.getSsn());
		System.out.println("Votre age est= " +ec.getEmpAge());

	}

}
