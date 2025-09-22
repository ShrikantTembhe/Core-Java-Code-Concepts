package com.java.practice.object;

/*
 * Make an string representation of the objects that we want
 */
public class ToString {
	@Override
	public String toString() {
		return "ToString [p=" + p + ", a=" + a + "]";
	}
	int p;
	int a;

	public static void main(String[] args) {

		ToString ts = new ToString();

		ts.a = 10;
		ts.p = 96;

		System.out.println(ts);
	}
}
