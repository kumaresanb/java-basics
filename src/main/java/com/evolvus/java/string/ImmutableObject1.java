package com.evolvus.java.string;

final class A{
	private final String name;
	public A(String  name) {
		this.name=name;
	}
	
	public String getName() {
		return  name;
	}
	
}

public class ImmutableObject1 {
	
	public static void main(String[] args) {
		A a1=new A("kumar");
		A a2=new A("siva");
		System.out.println("A1 Object::"+a1.getName());
		System.out.println("A2 Object::"+a2.getName());
		
	}

}
