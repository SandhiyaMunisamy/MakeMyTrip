package com.atmecs.Sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) {
		try {

			int x;
			FileInputStream fileInputStream = new FileInputStream("C:\\sandhiya\\demo.txt");
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\sandhiya\\demo.txt");

			while ((x = fileInputStream.read()) != -1) {
				fileOutputStream.write(x);
			}

			fileOutputStream.close();
			fileInputStream.close();
			System.out.println("\n\nTask Completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}