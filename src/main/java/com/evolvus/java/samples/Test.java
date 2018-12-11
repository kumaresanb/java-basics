package com.evolvus.java.samples;

class E{
	void test() {
		System.out.println("I am in E test");	
	}
}

class F extends E{
	void test1() {
		System.out.println("I am in F test1");
	}
	
	@Override
	void test() {
		// TODO Auto-generated method stub
		super.test();
	}
}

abstract class G{
	public abstract void run();
}

abstract class D{
	public abstract void run1();
}


class Test {
	public static void main(String[] args) {
			
	}
}
