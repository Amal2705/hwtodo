package oops;

public class methodoverloading 
{

	public static void main(String[] args)
	{
     methodoverloading ob=new methodoverloading();
     ob.add(2,1);
     ob.add(2, 5,6);
     ob.add(4, 4.799888);
     ob.add(2.4, 4);
 
	}

	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int c,int b)
	{
		System.out.println(a+b+c);
	}
	
	public void add(int a,double b)
	{
		System.out.println(a+b);
		
	}
	
	public void add(double b, int a)
	{
		System.out.println(a+b);
	}
}
