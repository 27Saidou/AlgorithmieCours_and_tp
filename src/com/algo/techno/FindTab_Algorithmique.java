package com.algo.techno;

public class FindTab_Algorithmique {

	public static void main(String[] args) {
		int []numbers=new int [] {55,32,45,98,82,11,9,39,50};
		int petit=numbers[0];
		int larges=numbers[0];
		for (int i = 1; i<numbers.length; i++) {
			   if (numbers[i] <larges)
			    larges= numbers[i];
			   else if (numbers[i] < petit)
			    petit= numbers[i];
		}
		System.out.println("Le plus large numero est:"+larges);
		System.out.println("Le plus petit numero est:"+petit);

	}

}
