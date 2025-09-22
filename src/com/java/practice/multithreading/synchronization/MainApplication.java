package com.java.practice.multithreading.synchronization;

public class MainApplication {

	public static void main(String[] args) {

		AccountWithdrawal accountwithdrawn = new AccountWithdrawal();

		Thread thread1 = new Thread(accountwithdrawn);
		Thread thread2 = new Thread(accountwithdrawn);

		thread1.setName("Demon_1");
		thread2.setName("Demon_2");

		thread1.start();
		thread2.start();
	}
}