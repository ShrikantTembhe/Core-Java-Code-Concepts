package com.java.practice.designpattern;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);

		// 1st Tier: 2nd Tier: and 3rd Tier:
		System.out.println("Please select the AC tickect type:");

		String input = sobj.next();

		BookingFactory bf = new BookingFactory();

		// Tire_1:
		FactoryPatterns fp = bf.bookTicket(input);

		System.out.println(fp.getAcClass(input));

	}
}