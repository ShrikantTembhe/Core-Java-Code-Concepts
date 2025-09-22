package demo.interview;

import java.util.Arrays;

//String str = "Java,c#,Selenium,TestNG,Maven";
//Arrange the string in ascending order.
public class Demo2 {

	public static void stringInAscendingOrder() {
		String str = "Java,c#,Selenium,TestNG,Maven";

		// filter out the string first by regx.
		String replace = str.replaceAll("^[A-z a-z #]", " ");

		String strArray[] = replace.split(" ");

		Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER);

		for (String sn : strArray) {
			System.out.print(sn + " ");
		}
	}

	public static void main(String[] args) {

		stringInAscendingOrder();
	}
}