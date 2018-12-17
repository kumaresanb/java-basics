package com.evolvus.java.string;

class E {
	private int i;

	public E(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

}

public class ImmutableObjectWithoutFinal {
	public static void main(String[] args) {
			E e1=new E(10);
			System.out.println(e1.getI());
			E e2=new E(30);
			System.out.println(e2.getI());
	}
}
