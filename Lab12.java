package com.HelloWorld;

public class Lab12 {
	public static void main(String[] args) {
		String String1 = "You and Me";
		String String2 = " you and me ";
		
		if (String1.equals(String2))
			System.out.println("equal");
		else
			System.out.println("Not equal");
		
		
		String check = "me";
		System.out.println(String1.contains(check));
		
		System.out.println(String1.length());
		
		System.out.println(String1.substring(0,5));
		
		System.out.println(String2.trim());
		
		System.out.println(String1.toUpperCase());
		
		System.out.println(String2.toUpperCase().trim());
		
		
	}
}
