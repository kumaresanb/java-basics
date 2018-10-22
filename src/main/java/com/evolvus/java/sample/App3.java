package com.evolvus.java.sample;

import java.util.Scanner;

public class App3 {
		private static final Scanner SC=new Scanner(System.in);
		public static void main(String[] args) {
			int N=SC.nextInt();
			SC.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			SC.close();
			if(N>=2&&N<=20) {
				for (int i = 1; i <=10 ;i++) {
					System.out.printf("%d x %d = %d%n", N, i, N*i);							
					
				}
			}
		}
}
