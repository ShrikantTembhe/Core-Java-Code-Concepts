package com.trys.catchs.block;

public class MainApplication {

	public static void main(String[] args) {

		ClassC cobj = new ClassC();

		try {
			ClassC.checkException(10, 0);
		} catch (Exception ae) {
			// ae.printStackTrace();
			ae.getMessage();
		}
	}

}