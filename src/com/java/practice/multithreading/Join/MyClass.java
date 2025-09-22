package com.java.practice.multithreading.Join;

//Create an user class and extends by Thread(not to used main method).
public class MyClass extends Thread {

	public void run() {

		// Used loop to check how join method works.
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread:A");
		}
	}
}