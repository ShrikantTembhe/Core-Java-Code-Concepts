package com.java.practice.designpattern;

public class SingleTonCall {

	public static void main(String[] args) {

		SingleTonPattern obj1 = SingleTonPattern.getObjectCreated();
		// 1St object:
		System.out.println(obj1.hashCode());

		SingleTonPattern obj2 = SingleTonPattern.getObjectCreated();
		// 2nd Object:
		System.out.println(obj2.hashCode());

	}
}