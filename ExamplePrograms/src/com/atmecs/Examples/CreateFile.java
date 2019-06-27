package com.atmecs.Examples;
import java.io.FileWriter;
import java.io.IOException;
public class CreateFile {
	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("C:\\Users\\Sandhiya.Munisamy\\Documents\\Java Programs\\workspace\\Demo.txt");
			fw.write("ABC");
			fw.write("\n");
		    fw.write("abc");
		    fw.flush();
		    System.out.println("Write completed");
		}
		catch(IOException e)
		{
			System.out.println("Exception when writing data");
		}
		finally {
			try {
				fw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
}
	}
}
