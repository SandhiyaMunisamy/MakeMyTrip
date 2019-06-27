package com.atmecs.Concepts;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {
	public static void main(String[] args) throws Exception {
		File f=new File("demo.txt");
		FileOutputStream fos = new FileOutputStream("demo.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("Demo content");
		
		FileInputStream fis = new FileInputStream("demo.txt");
		DataInputStream dis = new DataInputStream(fis);
				String str=dis.readUTF();
				System.out.println(str);
	}

}
