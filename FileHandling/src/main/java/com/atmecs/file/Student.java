package com.atmecs.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private static String name;
	public static String id;
	private static String age;
	private static String gender;
	public static Scanner sc = new Scanner(System.in);
	public static File file = new File("C:/file Handling/FileProgram.txt");

	public void createFile() {
		try {

			// Create the file
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void WriteFile() {

		try {
			System.out.println("Enter the Student Name:");
			String name = sc.next();
			System.out.println("Enter the Student Id:");
			String id = sc.next();
			System.out.println("Enter the Age:");
		    String age = sc.next();
			System.out.println("Enter the Gender:");
			String gender = sc.next();
			
			String textToAppend = name+","+id+","+age+","+gender+"\n";
			FileWriter f = new FileWriter("C:/file Handling/FileProgram.txt",true);
			BufferedWriter bw = new BufferedWriter(f);
			
			bw.append(textToAppend);
			bw.flush();
			bw.close();
			
/*	bw.write(name);
			System.out.println("Student Name:" + name);
			bw.write(id);
			System.out.println("Enter the Student Id:" + id);
            bw.write(age);
			System.out.println("Enter the Age:" + age);
			bw.write(gender);
			System.out.println("Enter the Gender:" + gender);
			bw.flush();
		fw.close();*/

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public void adding() throws IOException{
	try {       int s;

        FileReader reader = new FileReader("C:/file Handling/FileProgram.txt");
        BufferedReader bw=new BufferedReader(reader);

        while ((s = bw.read()) != -1) {
            System.out.print((char)s);
        }
        reader.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
}

	/*void adding() throws IOException {
		FileReader fr = new FileReader("C:\\file Handling\\fo.txt");
		int i = 0;
		while ((i = fr.read()) != -1) {
			System.out.println((char) i);
		}

	}*/

	public static void main(String[] args) throws IOException {
		Student st = new Student();
		st.createFile();
		st.WriteFile();
		
				st.adding();
			
		
	}

	

}
