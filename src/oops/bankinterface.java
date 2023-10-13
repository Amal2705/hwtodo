package oops;

import java.util.Scanner;

interface Bank
{
	public void accountdetails();
	public void balance();
	public void deposit();
	public void withdrawal();
	
}

class Sbi implements Bank
{
	Scanner sc=new Scanner(System.in);
   static String c= "SBI";
    int balance=20000;
    
   @Override
	public void accountdetails() 
	{
		System.out.println("enter the name");
		System.out.println("enter the account number");
		
		
		String a=sc.nextLine();
		int b=sc.nextInt();
		
		
		
	}

	@Override
	public void balance() 
	{
		System.out.println(balance);
		
	}

	@Override
	public void deposit()
	{
		System.out.println("enter your deposit amount");
		int d=sc.nextInt();
		balance=balance+d;
		System.out.println("Balance after deposit = "+balance);
		
	}

	@Override
	public void withdrawal() 
	
	{
		System.out.println("enter the withdrawal amount");
		int e=sc.nextInt();
		balance=balance-e;
		System.out.println("final balance = "+balance);
	}
		
	
	
}


public class bankinterface
{

	public static void main(String[] args)
	{
		Sbi ob=new Sbi();
		ob.accountdetails();
		ob.balance();
		ob.deposit();
		ob.withdrawal();

	}

}
