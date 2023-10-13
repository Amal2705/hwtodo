package amal1package;

import java.util.Scanner;

public class multiplicationtable
{

	public static void main(String[] args)
	{
		System.out.println("enter the number");
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    
	   int mul=0;
	   for(int i=0;i<=10;i++)
	   {
		   mul=a*i;
		   System.out.println(i+"*"+a+"="+mul);
		
	   }
        
	}

}
