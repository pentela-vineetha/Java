package com.vin.examples;

public class Iterations {

	 
		public static void main(String[] args) {  
			int k=1;
		    for(int i=1;i<=10;i++){  
		        System.out.println(i);  
		    }  
		    int arr[]={12,23,44,56,78};  
		    for(int i:arr){  
		        System.out.println(i);  
		}  
		 
		 //labled for loop
		    aa:  
		        for(int i=1;i<=3;i++){  
		            bb:  
		                for(int j=1;j<=3;j++){  
		                    if(i==2&&j==2){  
		                        break aa;  
		                    }  
		                    System.out.println(i+" "+j);  
		                }  
		        }  
		
		
		 while(k<=10){  
		        System.out.println(k);  
		    k++;  
		    }  
		 
		 
		 int i=1;  
		    do{  
		        System.out.println(i);  
		    i++;  
		    }while(i<=10);  
		    
		    //break 
		    for(int i1=1;i1<=10;i1++){  
		        if(i1==5){  
		            break;  
		        }  
		        System.out.println(i1);  
		    }  
		    
		    
		    
		//infifnte do while loop
		/*    do{  
		        System.out.println("infinitive do while loop");  
		    }while(true);  */
		    
		//infinite while loop
		 
		 /*while(true){  
		        System.out.println("infinitive while loop");  
		    }  */
		 
		 
		
		//infinite loop
		for(;;){  
	        System.out.println("infinitive loop");  
	    }  //ctrl+c to exit
		
		
		  
	   
	    
	    
		}
}
