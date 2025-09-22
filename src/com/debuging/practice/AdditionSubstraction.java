package com.debuging.practice;

import java.util.Scanner;

/*
 * Addition and Substraction function and perform method wise debuging.
 */
public class AdditionSubstraction {

	public static int addNum(int a, int b) {

		int Result1 = a + b;

		return Result1;
	}

	public static int subNum(int c, int d) {
		int Result2 = c - d;

		return Result2;
	}

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter First Number:");
		int num1 = sobj.nextInt();

		System.out.println("Enter Second Number:");
		int num2 = sobj.nextInt();

		int Addition = addNum(num1, num2);

		System.out.println("Addition :" + Addition);

		int Substraction = subNum(num1, num2);

		System.out.println("Substraction :" + Substraction);
	}
}