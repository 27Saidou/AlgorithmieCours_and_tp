package com.algo.techno;

public class DemoStack {

	public static void main(String[] args) {
		Stack_Algorithmie nums=new Stack_Algorithmie();
		nums.push(15);
		nums.show();
		nums.push(8);
		nums.show();
		nums.push(18);
		nums.show();
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.size());
		System.out.println(nums.pop());
	}

}
