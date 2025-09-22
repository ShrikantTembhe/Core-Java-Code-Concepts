package com.java.practice.multithreading.synchronization;

/*Followed the steps applicable for the another class in synchronization..
 * Steps-> : 1)Define the method to withdrawal of money by using specific amount under for loop.
 *           2)Extends or implement this secondary class by Throwable class or Runnable interface.
 *           3)Create object of Account class in this secondary class.
 */
public class AccountWithdrawal implements Runnable {

	Account account = new Account();

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			makeWithdrawal(1000);

			if (account.getBalance() <= 0) {
				System.out.println("Insufficient Fund Available.");
			}
		}
	}

	private synchronized void makeWithdrawal(int amt) {
		if (account.getBalance() > amt) {

			System.out.println(Thread.currentThread().getName() + ":Going To Withdraw Money");
		}

		try {
			Thread.sleep(100);
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		int bal = account.withdrawAmount(amt);
		System.out.println(Thread.currentThread().getName() + ": Withdrawal Successful." + "bal :" + bal);

	}
}