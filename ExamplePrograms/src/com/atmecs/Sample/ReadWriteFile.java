package com.atmecs.Sample;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteFile {
	public static void main(String[] args) {
		try {
			int line;
			FileReader fileReader = new FileReader("C:\\sandhiya\\demo.txt");
			FileWriter fileWriter = new FileWriter("C:\\sandhiya\\demo.txt");

			while ((line = fileReader.read()) != -1) {
				fileWriter.write(line);
			}
			fileReader.close();
			fileWriter.close();
			System.out.println("Task Completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
