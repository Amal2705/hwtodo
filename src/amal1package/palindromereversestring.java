package amal1package;

import java.util.Scanner;

public class palindromereversestring
{
	//*important

	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string");
	  String a1=sc.nextLine();
	  String rev="";
	 
	  //hello
	  
	  for(int i=a1.length()-1;i>=0;i--)
	  {
		  rev=rev+a1.charAt(i);  //olleh
	  }
     if(rev.equals(a1))
     {
    	 System.out.println(rev+" is palidrome string");
     }
     else
     {
    	 System.out.println(rev+" is not a palindrome string");
     }
     
	}
	

}
