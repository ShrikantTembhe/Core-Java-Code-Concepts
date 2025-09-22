package demo.interview;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {

	// Find duplicate number from array
	// int a[] = { 1, 2, 3,4, 1};

	public static void findSameElement() {
		int a[] = { 1, 2, 3, 4, 1 };

		Set<Integer> set = new HashSet<Integer>();

		System.out.println("Same Elements: ");
		for (Integer i : a) {
			if (set.add(i) == false) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {

		findSameElement();
	}
}
