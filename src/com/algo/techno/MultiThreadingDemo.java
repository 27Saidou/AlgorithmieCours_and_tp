package com.algo.techno;

public class MultiThreadingDemo  implements Runnable{

	@Override
	public void run() {
		System.out.println("merci du fond de mon koto pour ton courage");
		
	}
	public static void main(String[] args) {
		MultiThreadingDemo mtd=new MultiThreadingDemo();
		Thread thread=new Thread(mtd);
		thread.start();
	}

}
