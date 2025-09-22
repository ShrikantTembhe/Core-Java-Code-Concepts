package com.java.exception.practice;

/*
 * { ArrayIndexOutOfBoundException -> Is cuaght when there is an element not exist within the range of the array elements. }
 */
public class ArrayIndexOutOfBound {

	public static void cughtException() {
		int arr[] = new int[10];

		arr[15] = 10;

		System.out.println(arr);
	}

	public static void main(String[] args) {

		cughtException();
	}
}