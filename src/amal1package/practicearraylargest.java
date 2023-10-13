package amal1package;

import java.util.Scanner;

public class practicearraylargest
{

	public static void main(String[] args)
	{
	 System.out.println("enter the numbers");
	 Scanner sc=new Scanner(System.in);
	 int []a=new int[5];
	 int largest=0;
	 for(int i=0;i<5;i++)
	 {
		 
		 a[i]=sc.nextInt();
		 if(a[i]>largest)
		 {
			 largest=a[i];
		 }
	 }
		
		System.out.println("largest="+largest);
   
	}

}
