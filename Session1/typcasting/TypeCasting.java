package com.simplilearn.typcasting;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit TypeCasting");
		byte a=11;
		System.out.println("value in byte of a = "+a);
		short b=a;
		System.out.println("value of a in  short = "+b);
		int c=b;
		System.out.println("value of a in  int = "+c);
		float d=c;
		System.out.println("value of a in  float = "+d);
		double e=d;
		System.out.println("value of a in  double = "+e);
		
		System.out.println("\nExplicit TypeCasting");

		double f=63.99;
		System.out.println("value of double "+f);

		int i=(int) f;
		
		System.out.println("double to int = "+i);

	}

}
