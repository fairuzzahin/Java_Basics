package com.it.bd;

public class Task5 {
   public void sum(int a,int b) {
	   System.out.println("Summation:"+(a+b));
   }
   public void sub(int a,int b) {
	   System.out.println("Subtraction:"+(a-b));
   }
   public void mul(int a,int b,int c) {
	   System.out.println("Multiplication:"+(a*b*c));
   }
   public void div(int a,int b) {
	   System.out.println("Division:"+(a/b));
   }
   public void rem(int a,int b) {
	   System.out.println("Remainder:"+(a%b));
   }
	public static void main(String[] args) {
		Task5 obj =new Task5();
		obj.sum(10,50);
		obj.sub(10,80);
		obj.mul(90,30,75);
		obj.div(50,60);
		obj.rem(10,70);
		
		
		

	}

}
