package com.vin.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


import java.util.Enumeration;

public class ArrayListEx {
	public static void main(String args[]) {
	      /*Creation of ArrayList: I'm going to add String
	       *elements so I made it of string type */
		  ArrayList<String> obj = new ArrayList<String>();

		  /*This is how elements should be added to the array list*/
		  obj.add("Ajeet");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");

		  /* Displaying array list elements */
		  System.out.println("Currently the array list has following elements:"+obj);

		  /*Add element at the given index*/
		  obj.add(0, "Rahul");
		  obj.add(1, "Justin");

		  /*Remove elements from array list like this*/
		  obj.remove("Chaitanya");
		  obj.remove("Harry");

		  System.out.println("Current array list is:"+obj);

		  /*Remove element from the given index*/
		  obj.remove(1);

		  System.out.println("Current array list is:"+obj);
		  /* For Loop for iterating ArrayList */
	      System.out.println("For Loop");
	      for (int counter = 0; counter < obj.size(); counter++) { 		      
	          System.out.println(obj.get(counter)); 		
	      }   		

	      /* Advanced For Loop*/ 		
	      System.out.println("Advanced For Loop"); 		
	      for (String num : obj) { 		      
	           System.out.println(num); 		
	      }

	      /* While Loop for iterating ArrayList*/ 		
	      System.out.println("While Loop"); 		
	      int count = 0; 		
	      while (obj.size() > count) {
		 System.out.println(obj.get(count));
	         count++;
	      }

	      /*Looping Array List using Iterator*/
	      System.out.println("Iterator");
	      Iterator<String> iter = obj.iterator();
	      while (iter.hasNext()) {
	         System.out.println(iter.next());
	      }
	      Enumeration<String> e = Collections.enumeration(obj);
	      
	      // Enumerate through the ArrayList elements
	      System.out.println("ArrayList elements: ");
	      while(e.hasMoreElements())
	      System.out.println(e.nextElement());
	   }
}
