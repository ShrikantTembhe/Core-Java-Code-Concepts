package com.java.exception.practice;

/*
 * UnChecked->RunTimeException sub types.
 */

public class ArithematicExceptions {

	public static void checkException() {
		int a = 10 / 0;
	}

	public static void main(String[] args) {

		checkException();
	}
}