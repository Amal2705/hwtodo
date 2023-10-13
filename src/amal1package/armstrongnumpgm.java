package amal1package;

import java.util.Scanner;

public class armstrongnumpgm {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int sum=0,rem=0,temp=num;
	while(num>0)
	{
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
 if(temp==sum)
 {
	 System.out.println("THE NUM IS ARMSTRONG");
 }
	 else
	 {
		 System.out.println("THE NUM IS NOT ARMSTRONG");
	 }
 
	}

}
