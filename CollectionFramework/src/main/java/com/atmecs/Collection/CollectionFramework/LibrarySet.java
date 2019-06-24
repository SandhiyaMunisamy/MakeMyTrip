package com.atmecs.Collection.CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LibrarySet {
	public static void main(String[] args) {
		
	HashSet<String> hset = new HashSet<String>();
	System.out.println("\nOperations in library:");
	hset.add("Search books");
	hset.add("Book renewal");
	hset.add("Cancel Book");
	hset.add("Pay Overdue");
	hset.add("Book renewal");
	hset.add(null);//accepts null value
	System.out.println(hset);//No insertion order
	
	
	
	LinkedHashSet<String> lhset = new LinkedHashSet<String>();
	System.out.println("\nLibrary card:");
	lhset.add("Name");
	lhset.add("Phone Number");
	LinkedHashSet<String> lhset1 = new LinkedHashSet<String>();
	lhset.add("Expiry date");
	lhset.add("Phone Number");
	lhset.add(null);//Accepts null value
	lhset.addAll(lhset1);
	System.out.println(lhset);//Insertion order
	
	Set<Book> set=new TreeSet<Book>();  
	set.add(new Book(131, "Let us C", "Yashwant Kanetkar", "BPB", 8));
	set.add(new Book(245, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4));
	set.add(new Book(777, "Operating System", "Galvin", "Wiley", 6));
	set.add(new Book(131, "Let us C", "Yashwant Kanetkar", "BPB", 8));
	//set.add(null);//(doesnot allow null values)
	 for(Book b:set){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  //Ascending order
		    }  
	
	 TreeSet<Integer> tset=new TreeSet<Integer>();
	 System.out.println("\nPreference based on quantity:");
	 tset.add(22);
	 tset.add(15);
	 tset.add(17);
	 tset.add(15);
	 System.out.println("Highest quantity:"+tset.pollLast());
	 System.out.println("Lowest Quantity:"+tset.pollFirst());
}
}

