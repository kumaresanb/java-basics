package com.evolvus.java.string;

class D {
	private int i;
	private int j;

	D(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
	
	@Override
	public String toString() {
		return "i="+i+","+"j="+j;
	}
}

public class ImmutableObjectWithoutFinal1 {
	public static void main(String[] args) {
			D d1=new D(120,23);
			System.out.println(d1.getI());
			System.out.println(d1.getJ());
			System.out.println(d1);
			D d2=new D(10,40);
			System.out.println(d2.getI());
			System.out.println(d2.getJ());
			System.out.println(d2);
	}
}
