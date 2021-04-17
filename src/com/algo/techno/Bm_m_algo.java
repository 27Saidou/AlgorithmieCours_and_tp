package com.algo.techno;

public class Bm_m_algo {

	public static void main(String[] args) {
		float[]t=new float[100];
		int i;
		float min=10;
		float max=12;
		for (i= 1; i <100; i++) {
			if(t[i]>=100) {
				max=t[i];
				min=t[1];
			}else {
				if(t[i]<min) {
					min=t[i];
				}
				System.out.println("Max=" +max+ "min="+min);
			}
			
		}

	}

}
