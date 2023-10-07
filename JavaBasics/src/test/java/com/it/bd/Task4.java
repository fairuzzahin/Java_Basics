package com.it.bd;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		   System.out.println("Please Enter first name:");
		   String name1 = input.nextLine();
		   System.out.println("First number is:"+name1);
		   System.out.println("Please Enter second name:");
		   String name2 = input.nextLine();
		   System.out.println("Second number is:"+name2);
           if(name1.equals(name2)) {
        	   System.out.println(name1+" "+"is equal to"+" "+name2);
           }else {
        	   System.out.println(name1+" "+"is not equal to"+" "+name2);
           }
	}

}
