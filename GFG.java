package com.vin.examples;

class Geek
{
    int num;
    String name;
 
    // this would be invoked while object
    // of that class created.
    Geek()
    {
    	
        System.out.println("Constructor called");
    }
    Geek(int n,String name)
    {
    	this.num=10;
    	this.name="vineetha";
    	System.out.println(this.num);
        System.out.println(this.name);
    }
}
 
public class GFG
{
    public static void main (String[] args)
    {
        // this would invoke default constructor.
        Geek geek1 = new Geek();
        Geek geek2 = new Geek( 1," ");
        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(geek1.name);
        System.out.println(geek1.num);
        
    }
}