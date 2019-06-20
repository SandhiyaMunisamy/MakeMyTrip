package com.atmecs.Collection.CollectionFramework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * 
 * @author Sandhiya.Munisamy
 *
 */

public class Library {
	public static void main(String[] args) {

		Member m1 = new Member(101, "Aarthi", 23);
		Member m2 = new Member(102, "Remma", 21);
		Member m3 = new Member(103, "Sanjana", 25);

		ArrayList<Member> list = new ArrayList<Member>();
		list.add(m1);// adding Member(customers) of library class object
		list.add(m2);
		list.add(m3);

		Member m4 = new Member(104, "Julie", 27);
		list.add(m4);// Getting Iterator
		Iterator itr = list.iterator();// traversing elements of ArrayList object
		while (itr.hasNext()) {
			Member l1 = (Member) itr.next();
			System.out.println(l1.Memberid + " " + l1.Membername + " " + l1.age);
		}

		List<Book> list1 = new LinkedList<Book>();// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);// Adding Books to the list
		list1.add(b1);
		list1.add(b2);
		list1.add(b3);// Traversing through list

		for (Book b : list1) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}

		Vector<String> newBooks = new Vector<String>();
		newBooks.add("OOPS");
		newBooks.add("\nData Structure");
		newBooks.add("\nDBMS");
		newBooks.add("\nPython");

		System.out.println("\nCapacity is: " + newBooks.capacity());

		Enumeration<String> en = newBooks.elements();
		System.out.println("\nNew books available:");
		while (en.hasMoreElements())
			System.out.print(en.nextElement() + " ");

	}
}
