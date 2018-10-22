package com.evolvus.java.sample;

public class C extends B {
	public static void main(String[] args) {
	      C b1 =new C();
	      b1.test1();
	}
	
	public void test1() {
		test();
		System.out.println("Override class in C ");
	}
}
