package com.atmecs.Collection.CollectionFramework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * 
 * @author Sandhiya.Munisamy
 *
 */

public class Library {
	public static void main(String[] args) {

		
		ArrayList<Member> list = new ArrayList<Member>();
		System.out.println("Registered Users:");
		list.add(new Member(101, "Aarthi", 23));
		list.add(new Member(102, "Remma", 21));
		list.add(new Member(103, "Sanjana", 25));
		list.add(new Member(101, "Aarthi", 23));//Allows duplicate values
       
		list.add(new Member(104, "Julie", 27));
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Member l1 = (Member) itr.next();
			System.out.println(l1.Memberid + " " + l1.Membername + " " + l1.age);//Insertion order
		}
	
		
		
		
		List<Book> list1 = new LinkedList<Book>();
		System.out.println("\nList of Books available:");
		
		list1.add(new Book(131, "Let us C", "Yashwant Kanetkar", "BPB", 8));
		list1.add(new Book(245, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4));
		list1.add(new Book(777, "Operating System", "Galvin", "Wiley", 6));
		list1.add(new Book(777, "Operating System", "Galvin", "Wiley", 6));//duplicates
		for (Book b : list1) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);//Insertion order
		}
		

		
		Vector<String> newBooks = new Vector<String>();
		newBooks.add("\nOOPS");
		newBooks.add("\nData Structure");
		newBooks.add("\nDBMS");
		newBooks.add("\nPython\n");
		
		/*System.out.println("Available new books: ");
	    for(int i=0; i < newBooks.size(); i++)
	    {
	       System.out.println(newBooks.get(i));
	    }*/
	    
	    Enumeration<String> en = newBooks.elements();
		System.out.println("\nNew books available:");
		while (en.hasMoreElements())
			System.out.print(en.nextElement() + " ");
		
	    newBooks.setSize(2);
	     System.out.println("\nFrequently used books: "+newBooks.size());
	     
	     for(int i=0; i < newBooks.size(); i++){
	        System.out.println(newBooks.get(i));
	     }
		
	}

	
}
		
		
		
		
		 
		 