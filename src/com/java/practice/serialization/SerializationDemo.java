package com.java.practice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Perform the serialization:
 * NOTE-> 1)FileOutputStream 2)ObjectOuputStream is the classes used to achieve serialization
 * ObjectOutputStream with its instance used write method to achieve serialization..
 */
public class SerializationDemo implements Serializable {

	private static final long serialVersionUID = 1L;
	// Define any global variable
	int p = 10;
	int q = 25;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Create class object of user.
		SerializationDemo sd = new SerializationDemo();

		System.out.println("serialization Started..");

		// Step_1(Used fileoutputstream class and pass file path(i.e txt))

		FileOutputStream fos = new FileOutputStream("C:\\Users\\77092\\OneDrive\\Desktop\\FirstSerialize.txt");

		// Used ObjectOutputStream and method name write to achive serialization.

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// Used method write from oos class.

		oos.writeObject(sd);

		System.out.println("Serialization Ended..");

		System.out.println("*******************************************************");

		System.out.println("Deserialization Started..");

		// Step_1:(FileInputStream)

		FileInputStream fis = new FileInputStream("C:\\Users\\77092\\OneDrive\\Desktop\\FirstSerialize.txt");

		// Step_2:(ObjectInputStream)

		ObjectInputStream ois = new ObjectInputStream(fis);

		// Step_3:(Used Object read method)
		SerializationDemo d2 = (SerializationDemo) ois.readObject();

		System.out.println("Desrialization Ended..");
		System.out.println("P:" + d2.p + " " + "Q:" + d2.q);
	}
}