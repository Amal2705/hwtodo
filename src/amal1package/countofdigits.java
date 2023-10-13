package amal1package;

import java.util.Scanner;

public class countofdigits 
{

	public static void main(String[] args)
	{
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();	
		int count=0;
		while(a>0) 
		{
			a=a/10;
			count++;
		}
		System.out.println("no:of digits = "+count);
		

	}

}
