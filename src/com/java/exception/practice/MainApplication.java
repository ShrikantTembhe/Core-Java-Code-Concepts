package com.java.exception.practice;

public class MainApplication {

	public static void main(String[] args) {

		AvailableBalance ab = new AvailableBalance();

		try {
			AvailableBalance.getAmountWithdrawal(1500);
		} catch (InsufficientFundException ie) {
			System.out.println("Caught by insufficient fund exception.");
		} finally {
			System.out.println("Execution successful");
		}
	}
}