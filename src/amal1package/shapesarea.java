package amal1package;

public class shapesarea {

	public static void main(String[] args)
	{
		shapesarea sh=new shapesarea();
		sh.rectarea();
		sh.circarea(2);
		double triangans=sh.triangare();
		System.out.println("area of triangle ="+triangans);
     double squareans=sh.squarearea(2);
     System.out.println("area of square ="+squareans);

	}

//rectangle
	public void rectarea()
	{
		int a=10,b=10,c;
		c=a*b;
		System.out.println("area of rectangle ="+c);
	}
	
	
//circle
	public void circarea(double r)
	{
		double area=3.14*r*r;
		System.out.println("area of circle ="+area);
	}
	
//triangle
	public double triangare()
	{
		double b=10,h=5,c;
		c=0.5*b*h;
		return c;
	}

	
//square
	public double squarearea(double a)
	{
		double b=a*a;
		return b;
		
	}
	
	
	
	
	
	
}
