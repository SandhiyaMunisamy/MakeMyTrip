package com.atmecs.javadoc;

import java.util.Scanner;

/**
 * 
 * @author Sandhiya.Munisamy
 * 
 */

public class PasswordCheck {

	private String password;

	/**
	 * 
	 * @return password
	 */

	public String getPassword() {

		return password;

	}

	public void setPassword() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the password");

		password = sc.nextLine();

	}
	/**
	 * 
	 * @param password
	 * @throws PasswordCorrectionException
	 * @throws IndexOutOfBoundsException
	 */

	public void checkPassword(String password) throws PasswordCorrectionException, IndexOutOfBoundsException {

		if (password.length() > 4 && password.length() <= 8) {

			boolean flag = checkUppercase(password);

			if (flag == false) {

				PasswordCorrectionException passObj = new PasswordCorrectionException("Missing upper case letter");

				throw passObj;

			} else if (flag == true) {

				System.out.println(" your password is valid  ");

			}

		}

		else if (password.length() > 8) {

			IndexOutOfBoundsException obj = new IndexOutOfBoundsException();

			throw obj;

			/*
			 * System.out.println("Password exceeds 8 characters " + password);
			 * 
			 * System.out.println("set the password again");
			 * 
			 * setPassword();
			 * 
			 * String pass = getPassword();
			 * 
			 * checkPassword(pass);
			 */

		} else if (password.length() <= 4) {

			System.out.println("Password is too short " + password);

			System.out.println("set the password again");

			setPassword();

			String pass = getPassword();

			checkPassword(pass);

		}

	}
/**
 * 
 * @throws IndexOutOfBoundsException
 * @throws PasswordCorrectionException
 */
	void resetPassword() throws IndexOutOfBoundsException, PasswordCorrectionException {

		setPassword();

		String pass = getPassword();

		checkPassword(pass);

	}
	/**
	 * 
	 * @param password
	 * @return boolean 
	 */

	boolean checkUppercase(String password) {

		char[] passArr = password.toCharArray();

		for (int index = 0; index < passArr.length; index++) {

			char ch = passArr[index];

			if (Character.isUpperCase(ch)) {

				break;

			}

			if (index == (passArr.length - 1) && !Character.isUpperCase(ch)) {

				return false;

			}

		}

		return true;

	}

}
