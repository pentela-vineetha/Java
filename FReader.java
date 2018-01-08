package com.vin.examples;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FReader {
	public static void main(String[] args) throws IOException {
		Reader fr=new FileReader("F:\\testout.txt");    
    int i;    
    while((i=fr.read())!=-1)    
    System.out.print((char)i);    
    fr.close(); 
	}
}
