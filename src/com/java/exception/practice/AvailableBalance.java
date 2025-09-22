package com.java.exception.practice;

/*
 * Step_2 ->Create one class and take private integer attribute with name balance.
 * Step_3 -> Create one userDefined method with input of integer and used if else condition and 
 * throw exception inside it.
 * Step_4 ->Create main application class and then create object of userDefine class and get the result.
 */
public class AvailableBalance {

	private static int balance = 2800;

	public static synchronized void getAmountWithdrawal(int Amount) {
		if (Amount < balance) {

			System.out.println("Total Amount :" + balance);
			System.out.println("Withdrawal Amount :" + Amount);
			balance = balance - Amount;
			System.out.println("Avaiable Amount: " + balance);

		} else if (Amount > balance) {
			throw new InsufficientFundException("The entered amount is invalid." + "Available Bal: " + balance);
		}
	}
}