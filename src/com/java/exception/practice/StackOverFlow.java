package com.java.exception.practice;

/*
 * StackOverFlowError-> Whenever trying to call the method recursively then arsie stackoverflow error.
 */
public class StackOverFlow {

	public static void getStackOverflow() {

		System.out.println("Method One");
		getStackOverflow2();
	}

	public static void getStackOverflow2() {
		System.out.println("Method Two");
		getStackOverflow();
	}

	public static void main(String[] args) {

		getStackOverflow();
	}
}