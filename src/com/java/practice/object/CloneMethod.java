package com.java.practice.object;

/*
 * Protected Clone throws ObjectCloneNotSupportedException();
 */
public class CloneMethod implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println("Before clone..");

		CloneMethod mc1 = new CloneMethod();
		System.out.println(mc1.hashCode());

		CloneMethod mc2 = new CloneMethod();
		System.out.println(mc2.hashCode());

		System.out.println("After clone..");
		CloneMethod mc3 = (CloneMethod) mc2.clone();

		System.out.println(mc3.hashCode());
	}
}