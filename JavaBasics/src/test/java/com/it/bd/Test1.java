package com.it.bd;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Hello World!!!");
   Scanner input = new Scanner(System.in);
   System.out.println("Please Enter your name:");
   String name = input.nextLine();
   System.out.println("Your name is:"+name);
   System.out.println("Please Enter the number:");
   float num = input.nextFloat();
   System.out.println("The number is:"+num);
	}

}
