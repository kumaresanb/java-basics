package com.evolvus.java.string;

class F {
	private int i;

	F(int i) {
		this.i = i;
		this.setI(i);
	}

	F setI(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new F(i);
		}

	}

	public int getI() {
		return i;
	}
}

public class ImmutableClass {
	public static void main(String[] args) {
		F f1=new F(10);
		F f2=f1.setI(10);
		F f3=f2.setI(20);
		System.out.println(f1==f2);
		System.out.println(f2==f3);
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		System.out.println(f3.hashCode());
		System.out.println(f1.getI());
		System.out.println(f2.getI());
		f3.setI(30);
		System.out.println(f3.getI());

	}
}
