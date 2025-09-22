package com.java.practice.designpattern;

/*
 * SingleTon pattern creates an only one object and provide global point of access to it.
 * SinglePattern -> Design constraints voilated by cloning and seriaizations need to used methods.
 * Cloning -> ObjectCloneNotSupported Method Serialization->ReadResolve Method.
 */
public class SingleTonPattern implements Cloneable {

	// Step_1-> Create public static and final instance of the class.
	// Step_2 -> Create private constructor of class
	// Step_3 -> Create synchronized method and used validation for if conditions.

	public static SingleTonPattern spc;

	private SingleTonPattern() {
		System.out.println("SingleTon Constructor.");
	}

	public static synchronized SingleTonPattern getObjectCreated() {
		if (spc == null) {
			spc = new SingleTonPattern();
		} else {
			return spc;
		}
		return spc;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return spc;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		SingleTonPattern obj1 = SingleTonPattern.getObjectCreated();

		System.out.println(obj1.hashCode());

		SingleTonPattern obj2 = SingleTonPattern.getObjectCreated();

		System.out.println(obj2.hashCode());

		// Try by using the clone method and check how to prevent the cloning.

		System.out.println("***********Cloning***********");
		SingleTonPattern obj3 = (SingleTonPattern) obj1.clone();

		System.out.println(obj3.hashCode());
	}
}