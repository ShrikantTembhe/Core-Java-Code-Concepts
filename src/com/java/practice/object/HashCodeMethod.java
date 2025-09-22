package com.java.practice.object;

/*
 * public int hashcode() method is used given by jvm internally used to find the bucket index where it exactly stores
 * not for checking the object refrence..
 */
public class HashCodeMethod {

	public static void main(String[] args) {

		HashCodeMethod hm1 = new HashCodeMethod();
		System.out.println(hm1.hashCode()); // hashcode.

		HashCodeMethod hm2 = new HashCodeMethod(); // hashcode.
		System.out.println(hm2.hashCode());

		HashCodeMethod hm3 = new HashCodeMethod(); // hashcode.
		HashCodeMethod hm4 = new HashCodeMethod();
		hm3 = hm4;
		System.out.println("Equal Objects....");
		System.out.println(hm3.hashCode());

		System.out.println(hm4.hashCode());

	}
	// Bucket Index -> hashcode & (n-1);
	// Hashcode -> keys.hashcode();
}