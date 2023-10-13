package amal1package;

public class methodcreation {

	public static void main(String[] args) 
	{
		methodcreation ob=new methodcreation();
		ob.add();
		
		ob.sub(10, 5);
		
		
		int mulans=ob.mul();
		System.out.println(mulans);
		
		double divans=ob.div(10,5);
		System.out.println(divans);
				
		

	}
	
//method without returntype and without parameter
	public void add()
	{
		int a=10,b=25,c;
		c=a+b;
		System.out.println(c);
		
	}

//method without returntype and with parameter
	public void sub(int a,int b)
	{
	
		int d=a-b;
		System.out.println(d);
	}	
		
	
//method with returntype and without parameter
	public int mul()
	{
		int a=10,b=5,c;
		c=a*b;
		return c;
	}

//method with returntype and with parameter
	public double div(double a,double b)
	{
	double c=a/b;
	return c;
	}
	

}
