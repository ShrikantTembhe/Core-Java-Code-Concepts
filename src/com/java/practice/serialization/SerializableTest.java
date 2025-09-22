package com.java.practice.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTest {
	int a = 21;
	int b = 89;

	public static void main(String[] args) throws IOException {

		SerializableTest d1 = new SerializableTest();

		System.out.println("Serialization Started..");

		// Step_1:(FileInputStream)
		FileOutputStream fos = new FileOutputStream("C:\\Users\\77092\\OneDrive\\Desktop\\FirstSerialize.txt");

		// Step_2:(ObjectOutputStream)
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// Step_3:(Write())
		oos.writeObject(d1);

		System.out.println("Serialiation Started..");
	}
}