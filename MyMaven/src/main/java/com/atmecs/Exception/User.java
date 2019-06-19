package com.atmecs.Exception;

import com.atmecs.ExceptionHandling.Exception.PasswordCheck;
import com.atmecs.ExceptionHandling.Exception.PasswordCorrectionException;

public class User {
	public static void main(String[] args) {

		PasswordCheck pass = new PasswordCheck();

		boolean status = passwordVerify(pass);

		while(status==false) {

			status = passwordVerify(pass);

		}

		

	}

	

	public static boolean passwordVerify(PasswordCheck pass) {

		boolean passwordStatus = false;

		pass.setPassword();

		try {

			String password = pass.getPassword();

			pass.checkPassword(password);

			passwordStatus = true;

		}

		catch(PasswordCorrectionException e) {

			System.out.println(e.getMessage());

		}

		catch(IndexOutOfBoundsException e) {

			System.out.println("Password exceeds 8 characters " );

			System.out.println("set the password again");

		}

		

		return passwordStatus;

	}

}
