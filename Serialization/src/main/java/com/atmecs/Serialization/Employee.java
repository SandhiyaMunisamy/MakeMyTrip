package com.atmecs.Serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = 123456789L;
	public String Employeename;
	public int EmployeeID;
	public String Email;
	public transient String Password;
	
	Employee(String name,int id,String email,String password)
	{
		this.Employeename=name;
		this.EmployeeID=id;
		this.Email=email;
		this.Password=password;
	}	 
}
