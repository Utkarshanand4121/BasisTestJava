package com.Utkarsh;
import java.util.Scanner;
public class BasicTestprogram {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
        System.out.println("Choose the choice as per your Use \n"
        		+ " Enter '1' to find Even or Odd \n"
        		+ " Enter '2' to find Factorial \n"
        		+ " Enter '3' to find Prime Number or Not ");
        System.out.println(" Enter your Choice : ");
        int choice=in.nextInt();
        int num;
         switch(choice) {
         case 1:
        	 System.out.println("Enter your Number : ");
        	 num=in.nextInt();
        	 if(num%2==0)
        		 System.out.println(num+" is Even Number");
        	 else
        		 System.out.println(num+" is Odd Number");
        	 break;
        	 
         case 2:
        	 System.out.println("Enter your Number : ");
	         num=in.nextInt();
	         int i=1,fact=1;
	         while(i<=num) 
	         {
	           fact=fact*i;
	           i++;
	       	 }
	     	 System.out.println("Factorial of the number is " +fact);
	     	 break;
	        	 
	     case 3: 
	    	 System.out.println("Enter your Number : ");
	         int Num = in.nextInt();
	       	 int k,count=0;
	         for(k=2; k<Num; k++)
	         {
	            if(Num%k == 0)
	            {
	               count++;
	               break;
	            }
	         }
	         
	         if(count==0)
	            System.out.println("\nIt is a Prime Number.");
	         else
	            System.out.println("\nIt is not a Prime Number.");
	         break;
	         
	    default :
	    	System.out.println("Enter the choice correctly");
         }   
	}
}
