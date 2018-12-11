package com.evolvus.java.innerclass;

public class A {
	int i;
	static  int j;
	void test1() {
		System.out.println(i);
		System.out.println(j);
		test2();
	}
	static void test2() {
		//System.out.println(i) -- can use non-static member inside static method
		System.out.println(j);
	}
	public static void main(String[] args) {
		A a=new A();
		a.test1();
		
	}

}
