package com.evolvus.java.sample;

import java.util.Scanner;

public class App1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i=sc.nextInt();
		double d=sc.nextDouble();
		sc.nextLine();
		String str=sc.nextLine();
		sc.close();
		System.out.println("String is:"+str);
		System.out.println("Double is :"+d);
		System.out.println("Int os:"+i);
	}
}
