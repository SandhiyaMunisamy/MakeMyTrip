package com.atmecs.SpringFramework.AnnotationRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private String name;
	private int id;
	private int age;
	public int eid;
	public int DOJ;
	
	   
	 @Required
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }
	   
	  @Autowired
	   public void setid(int id) {
	      this.id = id;
	   }
	   public int getid() {
	      return id;
	   }
	   
	  
	   @Autowired
	   public void setAge(int age) {
	      this.age = age;
	   }
	   public int getAge() {
	      return age;
	   }
	
	   public void init(){
	      System.out.println("Bean is going through init.");
	   }
	   
	   
	   public void destroy(){
	      System.out.println("Bean will destroy now.");
	   }
	

}
