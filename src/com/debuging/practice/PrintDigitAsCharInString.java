package com.debuging.practice;

/*
 * Input -> p3q4r5
 * Output -> pppqqqqrrrrr
 */
public class PrintDigitAsCharInString {

	// 1-Iterate over the string sn.
	public static void printTheCharsAsDigit(String sn) {

		for (int i = 0; i < sn.length(); i++) {
			// 2 get characters at sn.
			char ch = sn.charAt(i);

			// 3 check character is letter or not.
			if (Character.isLetter(ch)) {
				// 4 get the numeric values and proces further as done with digit scanning.
				// Proceed further by 1 index for next value check.
				int count = Character.getNumericValue(sn.charAt(i+1));

				// Itertae count times to add values of digit to chars.
				for (int j = 0; j < count; j++) {
					System.out.print(ch);
				}
				// Skip value and move next step.
				i++;
			}
		}
	}

	public static void main(String[] args) {

		String s = " p3q4r5";

		printTheCharsAsDigit(s);
	}
}
