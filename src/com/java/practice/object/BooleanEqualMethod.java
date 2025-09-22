package com.java.practice.object;

/*
 * public booleanEqaul();
 * Boolean equal method is used to check the address of the objects not to contents.. 
 */
public class BooleanEqualMethod {

	public static void main(String[] args) {

		// Check the address of the objects not the contents of the objects.
		BooleanEqualMethod be1 = new BooleanEqualMethod();

		BooleanEqualMethod be2 = new BooleanEqualMethod();

		System.out.println(be1 == be2); //Check the address(false)
	}
}