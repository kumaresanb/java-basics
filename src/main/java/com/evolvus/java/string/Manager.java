package com.evolvus.java.string;

public class Manager {
	
	public static void main(String[] args) {
		String str1="momlotsis";
		char c[]=str1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}	
		System.out.println("Reverse String");
		for(int i=c.length-1;i>=0;i--) {
			System.out.println(c[i]);
		}
	}

}
