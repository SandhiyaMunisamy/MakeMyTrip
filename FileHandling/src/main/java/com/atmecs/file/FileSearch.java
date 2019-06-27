package com.atmecs.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileSearch {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String word=sc.nextLine();
	
		try
		{
			File f=new File("C:/file Handling/FileProgram.txt");
			if(f.exists())
			{
				BufferedReader br=new BufferedReader(new FileReader(f));
				String line;
				String []words;
				int i;
				while((line=br.readLine())!=null)
				{
					words=line.split(",");
					for(i=0;i<words.length;i++)
					{
						if(words[i].equals(word))
						{
							for(int j= 0; j<words.length;j++) {
								System.out.print(words[j]+" ");
							}
						}
					}
				}
			
			}
			else {
				System.out.println("File not found");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
		
	
	
}

}
