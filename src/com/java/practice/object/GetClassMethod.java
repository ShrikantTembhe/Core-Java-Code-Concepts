package com.java.practice.object;

/*
 * Get class method is used to get the metadata of the class and is method of object class.
 */
public class GetClassMethod {

	public static void main(String[] args) {

		GetClassMethod gc = new GetClassMethod();

		System.out.println(gc.getClass()); // Package + class name

		System.out.println(gc.getClass().getSimpleName()); // Class name

		System.out.println(gc.getClass().getCanonicalName()); // Pkg + class name

		System.out.println(gc.getClass().getName()); // Pkg + class name

		System.out.println(gc.getClass().getPackageName()); // Package name

		System.out.println(gc.getClass().getTypeName()); // Package name + class name

	}
}