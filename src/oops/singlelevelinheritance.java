package oops;

class Parent
{
	int a=20,b=10,c;
	public void add()
	
	{
		
		c=a+b;
		
		System.out.println("sum is "+c);		
		
	}
	
}
class Child extends Parent
{
	public void sub()
	{
	
		
		System.out.println("sub");
		
		
	}
	
	
}


public class singlelevelinheritance 
{

	public static void main(String[] args)
	{
		Child e=new Child();
		e.sub();
		e.add();
		System.out.println(e.a);
        System.out.println(e.b);
        System.out.println(e.c);
	}

}
