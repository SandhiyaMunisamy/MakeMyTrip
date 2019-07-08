package com.atmecs.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void details(Employee emp ) {
	System.out.println("Employee name:" +emp.Employeename);
	System.out.println("Employee ID:" +emp.EmployeeID);
	System.out.println("Email:" +emp.Email);
	System.out.println("Password:" +emp.Password);
	}
	public static void main(String[] args) 
	    { 

	        Employee employee = new Employee("Sandhiya", 1017, "sandhiya20@gmail.com", "Sandhiya123");	
	
	 try {
         FileOutputStream SerializeFile=new FileOutputStream("C:/Users/Sandhiya.Munisamy/Documents/serialization/emp.txt");
         ObjectOutputStream out = new ObjectOutputStream(SerializeFile);
         out.writeObject(employee);
         out.close();
         SerializeFile.close();
         System.out.printf("Serialized data is saved\n");
         
         details(employee);
      } catch (IOException i) {
         i.printStackTrace();
      }
	}
}
