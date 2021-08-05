package com.algo.techno;

public class Count extends Thread {
public Count() {
	super("je suis devs java");
	System.out.println("Mon Thread creer avec"+this);
	start();
}
public void run() {
	try {
		for (int i = 0; i < 10; i++) {
			System.out.println("mon grd frere est devs python " + i);
			Thread.sleep(1000);
		}
	} catch (Exception e) {
		System.out.println("Thread interrompu"+e.getMessage());
	}
	System.out.println("Thread run is over");
}
}
