package com.atmecs.Concepts;

public class Cube {
	int length;
	int breadth;
	int height;
	
	public int getCubes()
	{
		return (length*breadth*height);
	}
	 Cube()
	 {
		length=10;
		breadth=20;
		height=30;
	 }
	 Cube(int l,int b,int h)
	 {
		length=l;
		breadth=b;
		height=h;
	 }
	 public static void main(String[] args) {
		Cube c=new Cube();
		System.out.println(c.getCubes());
		Cube c1=new Cube(20,30,40);
		System.out.println(c1.getCubes());
	}
}
