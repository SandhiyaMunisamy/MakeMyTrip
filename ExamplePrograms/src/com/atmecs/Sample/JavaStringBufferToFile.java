package com.atmecs.Sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaStringBufferToFile {
public static void main(String[] args) throws IOException {
	StringBuffer sb=new StringBuffer();
	sb.append("Good");
	sb.insert(0,"Hi");
	sb.append(System.getProperty("line.seperator"));
	sb.append("Morning");
	sb.replace(0, 2, "Sample");
	sb.delete(2, 3);
	sb.capacity();
	sb.charAt(0);
	
	BufferedWriter bw=new BufferedWriter(new FileWriter(new File("C:\\sandhiya\\demo.txt")));
	bw.write(sb.toString());
	bw.flush();
	bw.close();
	
	System.out.println("written");
	try {
	int line;
	FileWriter fileWriter = new FileWriter("C:\\sandhiya\\new.txt");
	fileWriter.write("Hello");
	FileReader fileReader = new FileReader("C:\\sandhiya\\new.txt");
	

	while ((line = fileReader.read()) != -1) {
		fileWriter.write(line);
	}
	fileReader.close();
	fileWriter.close();
	System.out.println("Task Completed");
} 
catch (Exception e) {
	e.printStackTrace();
}
}
}

