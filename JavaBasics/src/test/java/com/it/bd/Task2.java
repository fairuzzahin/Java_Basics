package com.it.bd;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		   System.out.println("Please Enter first number:");
		   int num1 = input.nextInt();
		   System.out.println("First number is:"+num1);
		   System.out.println("Please Enter second number:");
		   int num2 = input.nextInt();
		   System.out.println("Second number is:"+num2);
		   System.out.println("Please Enter third number:");
		   int num3 = input.nextInt();
		   System.out.println("Third number is:"+num3);
           if(num1<num2 && num1<num3) {
        	   System.out.println(num1+" "+ "is the smallest number among three numbers");
           }else if(num2<num1 && num2<num3) {
        	   System.out.println(num2+" "+ "is the smallest number among three numbers");
           }else {
        	   System.out.println(num3+" "+ "is the smallest number among three numbers");  
           }
	}

}
