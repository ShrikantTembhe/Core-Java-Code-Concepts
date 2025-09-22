package com.java.practice.multithreading.synchronization;

/*
 * Achieving synchonization in java
 * Step's-> : 1)Define privare attribute name balance 
 *           2)Define get and set method to that.
 *           3)Define the method that accept integer and and return the remaining balance. 
 */
public class Account {

	private int balance = 7500;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int withdrawAmount(int amount) {
		balance = balance - amount;
		return balance;
	}
}