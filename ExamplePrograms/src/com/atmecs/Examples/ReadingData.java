package com.atmecs.Examples;

import java.io.FileReader;
import java.io.IOException;

public class ReadingData {
	public static void main(String[] args) {
		FileReader fr=null;
		try {
			fr=new FileReader("C:\\Users\\Sandhiya.Munisamy\\Documents\\Java Programs\\workspace\\Demo.txt");
			int val=fr.read();
			while(val!=-1) {
				System.out.print((char)val);
				val=fr.read();
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception during read");
		}
		finally {
			try {
				fr.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
