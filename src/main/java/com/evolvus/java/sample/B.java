package com.evolvus.java.sample;

public class B extends A {
	@Override
	public void test() {
		System.out.println("A override class in B");
		super.test();
	}
}
