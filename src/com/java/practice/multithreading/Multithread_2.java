package com.java.practice.multithreading;

/*
 * The Runnable interface is intended that the class instances and inteneded to execute by 
 * using the Runnable interface and passing object to thread class.contain only one method called Run() method.
 */

public class Multithread_2 implements Runnable {

	public static void main(String[] args) {

		Multithread_2 m2 = new Multithread_2();

		Thread thread1 = new Thread(m2);

		thread1.start();

	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
		}
	}

}