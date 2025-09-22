package com.debuging.practice;

public class SecondLargestNumber {

	static int a[] = { 50, 41, 20, 63, 96, 78, 56 };

	public static void findSecondLargestNumber() {

		// Create array and sort the array in ascending order.
		int temp = 0;
		// Oth element of array scan
		for (int i = 0; i < a.length; i++) {
			// 1st element of array scan
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];

					a[i] = a[j];

					a[j] = temp;
				}

			}
		}
		// Array sorting done.Min To Max
		// Compare Largest last Index and Second Largest second last element.
		for (int k = a.length - 2; k < a.length; k++) {
			// Compare last and second last.
			if (a[k] != a[a.length - 1]) {
				System.out.println("Second Largest :" + a[k]);
				// as comparison done break the loop to avoid mismatch.
				break;
			}
		}
	}

	public static void main(String[] args) {

		findSecondLargestNumber();
	}
}
