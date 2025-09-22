package GitHubTutorial;

import java.util.Arrays;

public class FindEvenJavaEight {

	public static void findEven() {
		Integer a[] = { 11, 22, 33, 44, 55, 66, 77 };

		System.out.println("Even Numbers:");
		Arrays.asList(a).stream().filter(b -> b % 2 == 0).forEach(c -> System.out.print(c + " "));

	}

	public static void main(String[] args) {

		findEven();
	}
}
