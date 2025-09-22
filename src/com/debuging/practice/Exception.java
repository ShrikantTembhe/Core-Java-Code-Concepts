package com.debuging.practice;

//Specify the input values to this programs in console/teerminal.
public class Exception {

	public static void main(String args[]) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		int result = num1 / num2;

		System.out.println("Result Is: " + result);
	}
	/*
	 * 1-No value is passes gets ArrayIndexOutOfBoundException.
	 * 2-
	 */
}
