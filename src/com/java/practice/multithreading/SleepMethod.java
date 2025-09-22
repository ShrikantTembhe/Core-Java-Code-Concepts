package com.java.practice.multithreading;

/*
 * Sleep method is specially used when the thread dont want to perform the task until certain amount of time
 * it wait for specific miliseconds(waiting time.) 
 */
public class SleepMethod extends Thread {

	public void run() {

		String s1 = "HISHRIKANT";
		for (int i = 0; i < s1.length(); i++) {

			try {

				System.out.println(s1.charAt(i));
				Thread.sleep(2500);
			} catch (Exception exp) {
				System.out.println("Caught exception");
			}

		}

	}

	public static void main(String[] args) {

		SleepMethod sm = new SleepMethod();

		sm.start();

	}
}