package com.atmecs.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
	public static void main(String[] args) {
	Employee employee = null;
    try {
       FileInputStream fileIn = new FileInputStream("C:/Users/Sandhiya.Munisamy/Documents/serialization/emp.txt");
       ObjectInputStream in = new ObjectInputStream(fileIn);
       employee = (Employee) in.readObject();
       in.close();
       fileIn.close();
    } catch (IOException num) {
       num.printStackTrace();
       return;
    } catch (ClassNotFoundException c) {
       System.out.println("Employee class not found");
       c.printStackTrace();
       return;
    }
    
    System.out.println("Deserialized Employee\n");
    System.out.println("Name: " + employee.Employeename);
    System.out.println("Address: " + employee.EmployeeID);
    System.out.println("Email" + employee.Email);
    System.out.println("Password:" + employee.Password);
 }


}
