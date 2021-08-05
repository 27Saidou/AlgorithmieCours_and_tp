package com.algo.techno;

public class ExampleThreadApps {

	public static void main(String[] args) {
		Count cnt=new Count();
		try {
			while (cnt.isAlive()) {
				System.out.println("je suis content de toi koto dans ta progression dans le code en python  ");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println("Main est interrompu"+e.getMessage());
		}
		System.out.println("Main is over koto");

	}

}
