package com.java.exception.practice;

/*
 * Check where allowed try catch and where not allowed these blocks.
 */
public class TryCatch {

	public static void getCaught() {
		try {

		} catch (ArithmeticException ae) {

		} catch (Exception exp) {

		}

	}

	public static void getCaught2() {

		/*
		 * try {
		 * 
		 * } catch(Exception e) {
		 * 
		 * } catch(NullPointerException npe) {
		 * 
		 * } }
		 */
	}

	public static void getCaught3()
	{
		
	}
	
	public static void main(String[] args) {

		/*
		 * Step_1: try { (Error caused-> Enter finally to complete the block statement.)
		 * }
		 */

		// Step_2:
		// Allowed no caused any errors.
		/*
		 * try {
		 * 
		 * } catch (Exception exp) {
		 * 
		 * }
		 */
		// Step_3:
		// Not allowed Arithematic exception is become an unreachable code so it must be
		// an subclass of throwable class. it will generates and error for the
		// arithematic exception.
		/*
		 * try {
		 * 
		 * } catch (Exception e) {
		 * 
		 * } catch(ArithematicExceptions ae) {
		 * 
		 * }
		 */
	}
}