package amal1package;

import java.util.Scanner;

public class countnumofstring 
{

	public static void main(String[] args) 
	{
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ')
				
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
