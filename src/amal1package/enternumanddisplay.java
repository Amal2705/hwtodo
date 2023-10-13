package amal1package;

import java.util.Scanner;

public class enternumanddisplay 
{

	public static void main(String[] args)
	{
		char ch;
	
		do {
	System.out.println("enter the numbers");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int sum=0;
	
	
	sum=a+b;
	System.out.println("sum="+sum);
	System.out.println("do you want to continue Y/N");
	ch=sc.next().charAt(0);
	
		
	}
		while(ch=='Y'||ch=='y');
	

	}

}
