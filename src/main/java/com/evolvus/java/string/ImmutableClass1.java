package com.evolvus.java.string;

class G {
	private int i, j;

	G(int i, int j) {
		this.i = i;
		this.j = j;
	}

	G setI(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new G(i, j);
		}
	}

	G setJ(int j) {
		if (this.j == j) {
			return this;
		} else {
			return new G(i, j);
		}
	}

	G setIAndJ(int i, int j) {
		if (this.i == i && this.j == j) {
			return this;
		} else {
			return new G(i, j);
		}
	}

	@Override
	public String toString() {
		return "i=" + i + "," + "j=" + j;
	}
}

public class ImmutableClass1 {
	public static void main(String[] args) {
		G g1=new G(20, 30);
		G g2=g1.setI(20);
		G g3=g1.setJ(30);
		G g4=g1.setI(21);
		G g5=g4.setJ(32);
		G g6=g5.setIAndJ(21, 32);
		G g7=g1.setIAndJ(20, 30);
		System.out.println(g1==g4);
		System.out.println(g1==g2);
		System.out.println(g1==g3);
		System.out.println(g2==g7);
		System.out.println(g4==g7);




	}
}
