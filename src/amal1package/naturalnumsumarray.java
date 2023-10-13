package amal1package;

import java.util.Scanner;

public class naturalnumsumarray 
{

	public static void main(String[] args)
	{
		int sum=0;
		int ar[]=new int[10];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=9;i++)
		{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
				System.out.println("sum is " +sum);
				
				
		
				

	}

}
