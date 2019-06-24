package com.atmecs.Collection.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LibraryMap {
	public static void main(String[] args) {

		HashMap<Integer, Member> map = new HashMap<Integer, Member>();

		Member mem1 = new Member(333, "sandhiya", 23);
		Member mem2 = new Member(444, "kenny", 76);
		Member mem3 = new Member(445, "jenny", 22);

		map.put(1, mem1);
		map.put(2, mem2);
		map.put(3, mem3);
		

		for (Entry<Integer, Member> m : map.entrySet()) {
			int key = m.getKey();
			Member m1 = m.getValue();
			System.out.println("Book" + key + "Info");
			System.out.println(m1.Memberid + m1.age + m1.Membername);
		}

		TreeMap<String, Integer> display = new TreeMap<String, Integer>();
		display.put("Initha", 23);
		display.put("Kurinchi", 34);
		display.put("Saranya", 55);
		display.put("manisha", 14);
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();
		map1.put("Saranya", 66);

		Set tmap = map.entrySet();
		Iterator iterator = tmap.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("Name is: " + mentry.getKey() + " & Age is: ");
			System.out.println(mentry.getValue());

		}
		
		LinkedHashMap find=new LinkedHashMap();
		 find.put(1, "Java");
	      find.put(2, "development");
	      find.put(3, "course");

	      
	      String val = (String)find.get(2);

	      
	      System.out.println("Value for key 2 is: " + val);
	   }    
	

}
