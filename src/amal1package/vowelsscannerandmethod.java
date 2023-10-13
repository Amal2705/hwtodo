package amal1package;

import java.util.Scanner;

public class vowelsscannerandmethod
{

	public static void main(String[] args)
	
	{
		vowelsscannerandmethod ob=new vowelsscannerandmethod();
		
		  System.out.println("enter the word");
			Scanner sc=new Scanner(System.in);
			String v=sc.next();
	     ob.vowelcount(v);
	     
	     
	  
	}

	public void vowelcount(String v)
	{
	int c=0;
	{
	for(int i=0;i<v.length();i++)
	{
		if(v.charAt(i)=='a'||v.charAt(i)=='e'||v.charAt(i)=='i'||v.charAt(i)=='o'||v.charAt(i)=='u')
		{
			c++;
			
		}
	 }
	}
	System.out.println("vowelcount= "+c);
}
}
