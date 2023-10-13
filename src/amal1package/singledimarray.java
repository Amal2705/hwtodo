package amal1package;

import java.util.Scanner;

public class singledimarray
{

	public static void main(String[] args) 
	{
     System.out.println("enter numbers");
     Scanner sc=new Scanner(System.in);
     
     int ar[]=new int[5];
     
     for(int i=0;i<=4;i++)
     {
    	 ar[i]=sc.nextInt();
     }
    	 System.out.println("entered numbers are:");
    	 for(int i=0;i<=4;i++)
    	 {
    		 System.out.println(ar[i]);
    	 }

	}

}
