package com.atmecs.Concepts;

public class App {
 public static void main(String[] args) {
	Machine mach=new Machine();
	mach.start();
	
	
	InterfaceExample person1=new InterfaceExample("Bob");
	person1.greet();
	
	Info Info1=new Machine();
	Info Info2=person1;
	Info1.showinfo();
	Info2.showinfo();
	outputInfo(mach);
	outputInfo(person1);
}
 private static void outputInfo(Info info) {
	 info.showinfo();
	 
 }

}
