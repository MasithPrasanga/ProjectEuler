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
	
	public static boolean isPrimeNumber(int number){
		
		boolean isPrime = true;
		for(int i=2;i<=(number/2);i++){
			if(number%i == 0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}











