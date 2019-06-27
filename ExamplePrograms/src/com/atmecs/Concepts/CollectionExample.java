package com.atmecs.Concepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample {
	public static void main(String[] args) {
		Collection<Integer> value1=new ArrayList<Integer>();
		value1.add(2);
		value1.add(6);//It doesnot allow to specify index number
        System.out.println(value1);
		
		List<Integer> value2=new ArrayList<Integer>();
		value2.add(3);
		value2.add(7);
		value2.add(6);
		value2.add(5);
		value2.add(7);
		value2.add(6);//It will have duplicate values 
		System.out.println(value2);
		
		Set<Integer> value3=new HashSet<Integer>();
		value3.add(8);
		value3.add(2);
		value3.add(6);
		value3.add(5);
		value3.add(8);
		value3.add(5);//It will have unique values 
		System.out.println(value3);
		
		Set<Integer> value4=new TreeSet<Integer>();
		value4.add(9);
		value4.add(7);
		value4.add(5);
		value4.add(1);
		value4.add(2);
		value4.add(0);
		value4.add(4);
		value4.add(3);//It will give in sorted format
		System.out.println(value4);
	}

}
