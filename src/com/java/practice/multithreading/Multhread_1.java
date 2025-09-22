package com.java.practice.multithreading;

/*
 * Multithreading vendor of JVM and output order is unpredictable an not predict the execution order.
 * While extends thread class start method can be revoked directly.
 */
public class Multhread_1 extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("i: " + i);
		}
	}

	public static void main(String[] args) {

		//Create an user class object and directly call start() method by its instance.
		Multhread_1 m1 = new Multhread_1();

		m1.start();
	}
}