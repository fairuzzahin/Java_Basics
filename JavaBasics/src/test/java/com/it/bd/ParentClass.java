package com.it.bd;

public class ParentClass {
	public void sum(int a,int b) {
		   System.out.println("Summation:"+(a+b));
	   }
	   public static void sub(int a,int b) {
		   System.out.println("Subtraction:"+(a-b));
	   }
	   public void mul(int a,int b,int c) {
		   System.out.println("Multiplication:"+(a*b*c));
	   }
	   public static void div(int a,int b) {
		   System.out.println("Division:"+(a/b));
	   }
	   public void rem(int a,int b) {
		   System.out.println("Remainder:"+(a%b));
	   }

	public static void main(String[] args) {
		ParentClass obj = new ParentClass();
		obj.sum(10,50);
		sub(10,80);
		obj.mul(90,30,75);
		div(50,60);
		obj.rem(10,70);
		 
	}
	static {
		System.out.println("This program will be run fast");
	}

}
