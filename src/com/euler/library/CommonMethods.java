package com.euler.library;

public class CommonMethods {

	public static boolean isPalindromicNumber(int number) {
		
		boolean isPalindromic = false;
		int spare = number;
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		if (spare == reverse) {
			isPalindromic = true;
		}
		return isPalindromic;
	}

}
