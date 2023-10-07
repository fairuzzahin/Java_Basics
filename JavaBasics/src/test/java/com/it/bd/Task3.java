package com.it.bd;
import java.util.ArrayList;
public class Task3 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String> ();
		System.out.println("Array size:"+colors.size());
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Black");
		System.out.println(colors);
		System.out.println("Array size:"+colors.size());
		for(int i=0;i<colors.size();i++){
			System.out.println(colors);
		}

	}

}
