package com.vin.examples;

import java.net.MalformedURLException;
import java.net.URL;

public class Exception {
	
	public static void main(String args[]) throws MalformedURLException{
		Exception exe=new Exception();
	        try{
	            for(int i=5;i>=0;i--){
	                System.out.println(10/i);
	           
	                    exe.getJunk();
	                    System.out.println(i);
	                   // System.out.println("length of null string is "+exe.getStringSize(null));
	                    URL url = new URL("http://www.google.com");
	            
	            }
	        }
	         catch(ArithmeticException ex){
	            System.out.println("Exception Message: "+ex.getMessage());
	           
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        finally {
	            System.out.println("Inside finally block");
	        }
	       /* catch (Exception ee){
                System.out.println("Exception message: "+ee.getMessage());
	        }*/
	    }
	
		


	


	private void getJunk() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
	}
	
}	
