package com.java.exception.practice;

/*
 * NullPointerException -> Finding the length of the string having value null.
 */
public class NullPointerExecption {

	public static void caughtException() {
		String s1 = null;

		System.out.println(s1.length());
	}

	public static void main(String[] args) {

		caughtException();
	}
}