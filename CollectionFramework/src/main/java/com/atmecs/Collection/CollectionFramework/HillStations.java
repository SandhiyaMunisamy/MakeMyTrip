package com.atmecs.Collection.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class HillStations{ 
		 public static void main(String args[]){  
		  ArrayList<String> hills=new ArrayList<String>();//Creating arraylist  
		  hills.add("Ooty");//Adding object in arraylist  
		  hills.add("Shimla");  
		  hills.add("Manali");  
		  hills.add("Munnar");  
		  hills.add("Darjeeling"); 
		  hills.add("Coorg"); 
		  hills.add("Thekkady"); 
		  hills.add("Munnar"); 
		  hills.add("Cherrapunjee"); 
		  hills.add("Yelagiri"); 
		  System.out.println(hills);
		  
		  hills.add(1,"Kodaikanal");
		  
		  hills.remove(6);
		  
		  
		  //Traversing list through Iterator  
		  Iterator itr=hills.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		 }  

}
