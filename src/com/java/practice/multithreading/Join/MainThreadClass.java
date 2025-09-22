package com.java.practice.multithreading.Join;

//Define another class with main method and used the join method.
public class MainThreadClass {

	public static void main(String[] args) throws InterruptedException {

		MyClass t1 = new MyClass();
		t1.start();
		t1.join(); // Must execute on priority basis(Main method waits until t1 executions get
					// completed.)
//If commenting the line of t1.join()  then the random order will be allocated for both thread and main method 
		// for execution.

		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread:B");
		}
	}
}