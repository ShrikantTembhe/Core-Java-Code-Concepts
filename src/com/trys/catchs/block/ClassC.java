package com.trys.catchs.block;

public class ClassC  {


	public static void checkException(int a, int b) {
		int Result = a / b;
		System.out.println(Result);
		throw new ClassA("Arithematic Exception Caught.");
	}
}