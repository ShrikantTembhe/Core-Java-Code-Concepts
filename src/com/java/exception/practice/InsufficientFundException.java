package com.java.exception.practice;

/*
 * Step_1 ->Take one private attribute name {message} and then create an parametrised constructor.
 * 
 */
public class InsufficientFundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String message;

	public InsufficientFundException(String message) {
		this.message = message;
	}

}