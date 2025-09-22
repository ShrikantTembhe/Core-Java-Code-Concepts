package com.debuging.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateChar {

	public static void removeDuplicate() {

		String sn1 = "DELL";

		char dup[] = sn1.toCharArray();

		Set<Character> set = new HashSet<Character>();

		System.out.println("Duplicate Charatcer Are :");
		for (int i = 0; i < dup.length; i++) {
			if (set.add(sn1.charAt(i)) == false) {

				System.out.println(dup[i]);
			}
		}

	}

	public static void getDuplicateCharacter(String sn) {
		Set<Character> dupSet = new HashSet<Character>();

		Set<Character> dup = sn.chars().mapToObj(c -> (char) c).filter(e -> !dupSet.add(e)).collect(Collectors.toSet());

		for (Character actDuplicate : dup) {
			System.out.println(actDuplicate);
		}

	}

	public static void main(String[] args) {

		removeDuplicate();

		System.out.println("***************************");

		getDuplicateCharacter("DELL");
	}

}
