package com.debuging.practice;

public class Pallindrome {

	public static void checkPallindrome(int number) {
		int temp = number;

		int num = 0;
		// use while loop.
		while (number != 0) {

			// remainder.
			int rem = number % 10; // 3 2 1

			num = (num * 10) + rem; // 0*10 + 3 = 3, 3*10 + 2 = 32 , 32*10 + 1 = 321.
			// reduce number.
			number = number / 10;
		}
		if (num == temp) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

	public static void main(String[] args) {

		checkPallindrome(123); // Not palindrome
		checkPallindrome(-121); // palindrome
		checkPallindrome(-193); // Not Palindrome
		checkPallindrome(313); // Palindrome
		checkPallindrome(-313); // Palindrome
	}
}
