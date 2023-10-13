package amal1package;

import java.util.Scanner;

public class singledimstringarr 
{

	public static void main(String[] args) 
	{
		System.out.println("enter the names");
		String ar[]=new String[4];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=3;i++)
		{
			ar[i]=sc.nextLine();
		}
         System.out.println("entered names are:");
         
         for(int i=0;i<=3;i++)
         {
        	 System.out.println(ar[i]);
         }
	}

}
