package com.evolvus.java.string;

class B{
	private final  int i;
	B(int i){
		this.i=i;
	}
	public int getI() {
		return i;
	}
}


public class ImmutableObject {
	public static void main(String[] args) {
		B b1=new B(10);
		B b2=new B(20);
		System.out.println(b1.getI());
		System.out.println(b2.getI());
	}
	
}

