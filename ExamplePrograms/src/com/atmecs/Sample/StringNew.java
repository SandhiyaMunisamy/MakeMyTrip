package com.atmecs.Sample;

public class StringNew {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	String s1="Sandhiya";
	sb.append(s1);
	System.out.println(s1);
	StringBuffer sb1=new StringBuffer(s1);
	sb1.reverse();
	System.out.println(sb1);
	sb1.replace(0, 4, "haha");
	System.out.println(sb1);
	sb1.delete(0, 2);
	System.out.println(sb1);
	sb1.capacity();
	System.out.println(sb1);
	sb1.ensureCapacity(2);
	System.out.println(sb1);
	sb1.substring(3, 4);
	System.out.println(sb1);
	
	
	StringBuilder stb=new StringBuilder();
	stb.append("Atmecs");
	System.out.println(stb);
}
}
