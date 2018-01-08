package com.vin.examples;
//https://www.javatpoint.com/StringBuffer-class

public class StringBufferExample {

	 
		public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		
		System.out.println(sb);//prints Hello Java  
		}  
		
	
}
