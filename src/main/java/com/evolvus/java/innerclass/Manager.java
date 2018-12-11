package com.evolvus.java.innerclass;

class C{
	int e ,f;
	public int sub(int e,int f) {
		System.out.println("C class sub method");
		return e-f;
	}
}


public class Manager extends C {
	int a,b,c;
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	@Override
	public int sub(int e, int f) {
		System.out.println("Override method");
		super.sub(e, f);
		return e*f;
	}
	
	public static void main(String[] args) {
		Manager m=new Manager();
		System.out.println("Add methhod one:"+m.add(10, 20));
		System.out.println("Add methhod two:"+m.add(10, 20,30));
		C c=new Manager();
		System.out.println("Sub method:"+c.sub(30, 20));
		
	}

}
