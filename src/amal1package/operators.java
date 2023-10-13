package amal1package;

public class operators 
{

	public static void main(String[] args)
	{
		//OPERATORS
		
//	ARITHMETIC OPERATORS
	  int a=60,b=40;
	  System.out.println("Arithmetic operators");
	  System.out.println("a+b="+(a+b));
	System.out.println("a-b="+(a-b));
	System.out.println("a*b="+(a*b));
	System.out.println("a/b="+(a/b));
	System.out.println("a%b="+(a%b));
	
	

//ASSIGNMENT OPERATORS
	int c=20,d=200;
	System.out.println("Assignment operators");
	System.out.println(c=d);//200
	System.out.println(c+=d);//a=a+b
	System.out.println(c-=d);//a=a-b
	System.out.println(c*=d);//c=c*d
	System.out.println(d/=c);//d=d/c
	System.out.println(d%=c);//d=d%c
	
	
	
//Relational operators
	int e=40,f=20;
	System.out.println("Relational operators");
	System.out.println(e<f);
	System.out.println(e>f);
	System.out.println(e<=f);
	System.out.println(e>=f);
	System.out.println(e!=f);
	System.out.println(e==f);
	
	
	
	
	
//LOGICAL OPERATORS
	System.out.println("Logical operators");
	String g="amal";
	String h="amal345";
	System.out.println(g=="ama;"&& h=="amal345");	
	System.out.println(g=="amal32"|| h=="amal345");
	System.out.println(!(g=="amal"));
	System.out.println(!(h=="amal2345"));
	
	
	
//UNARY OPERATORS
	System.out.println("Unary operators");
	int i=2;
	System.out.println("increment operator");
	System.out.println(i++);
	System.out.println(i);
	System.out.println(++i);
	System.out.println("decrement operator");
	System.out.println(i--);
	System.out.println(i);
	System.out.println(--i);
	
	
	

//TERNARY OPERATORS
	System.out.println("Ternary Operators");
	int n1=10,n2=5;
	int value=n1>n2?n1:n2;
	System.out.println(value);
	String state=n1<n2?"n1 is greater":"n2 is greater ";
	System.out.println(state);
	}

}
