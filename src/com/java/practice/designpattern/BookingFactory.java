package com.java.practice.designpattern;

public class BookingFactory {

	public FactoryPatterns bookTicket(String input) {

		if (input.equalsIgnoreCase("FirstTier")) {
			return new FirstTier();
		} else if (input.equalsIgnoreCase("SecondTier")) {
			return new SecondTier();
		} else if (input.equalsIgnoreCase("ThirdTier")) {
			return new ThirdTier();
		} else {
			throw new IllegalArgumentException();
		}
	}
}