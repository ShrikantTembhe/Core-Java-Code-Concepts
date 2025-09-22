package com.java.practice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Serialization->FileOutputStream and ObjectOutputStream (No type Casting) Write() method;
 * Deserialization-> FileInputStream and ObjectInputStream (Type Casting) Read() method;
 */
public class SerializedDeserialized implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int a = 10;
	int b = 20;

	public int performAddition(int a, int b) {
		int Result = 0;
		this.a = 15;
		this.b = 35;

		Result = a + b;
		System.out.println("Addition Is: ");
		return Result;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("Serialization Started.");
		// Serialization:
		FileOutputStream fos = new FileOutputStream("C:\\Users\\77092\\OneDrive\\Desktop\\SeralizedDeserialized.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		SerializedDeserialized sd = new SerializedDeserialized();
		sd.performAddition(15, 35);

		oos.writeObject(sd);

		System.out.println("Serialization Ended.");

		System.out.println("*******************************************************");

		System.out.println("Deserialziation Started.");

		FileInputStream fis = new FileInputStream(
				"C:\\\\Users\\\\77092\\\\OneDrive\\\\Desktop\\\\SeralizedDeserialized.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		SerializedDeserialized sd2 = (SerializedDeserialized) ois.readObject();

		System.out.println("Dserialization Ended.");

		System.out.println(sd2.performAddition(50, 70));
	}
}