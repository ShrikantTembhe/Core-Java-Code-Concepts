package com.debuging.practice;

import java.util.HashSet;
import java.util.Set;

/*
 * Write a program to find duplicate from integer array
 */
public class Demo {

	public static void findDuplicate() {
		int a[] = { 10, 20, 30, 20, 10, 40, 50, 60, 40 };

		Set<Integer> set = new HashSet<Integer>();

		for (int i : a) {
			if (set.add(i) == false) {

				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {

		findDuplicate();
	}
}
