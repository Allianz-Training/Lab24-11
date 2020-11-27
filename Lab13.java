package com.HelloWorld;

public class Lab13 {
	public static void main(String[] args) {
		int total = 0;
		int[][] twoD_Array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		for (int row = 0; row < twoD_Array.length; row++) {
			for (int element = 0; element < twoD_Array[row].length; element++) {
				System.out.print(twoD_Array[row][element] + " ");
				if (element == twoD_Array[row].length - 1) {
					total += twoD_Array[row][element];

				}
			}
			System.out.println();
		}
		System.out.println("sum is :"+total);
	}

}
