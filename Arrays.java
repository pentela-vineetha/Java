package com.vin.examples;

class Arrays{  
public static void main(String args[]){  
  
int a[]={33,3,4,5};//declaration, instantiation and initialization  
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
//printing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
for(int i=0;i<3;i++){  
	 for(int j=0;j<3;j++){  
	   System.out.print(arr[i][j]+" ");  
	 }  
	 System.out.println();  
	}  
  
}}  