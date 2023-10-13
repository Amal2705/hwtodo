package oops;

class sports
{
	public void category()
	
	{
		System.out.println("Category");
		
	}
}

class type1 extends sports
{
	public void cricket()
	{
		System.out.println("Cricket");
	}
	
}

class type2 extends sports
{
	public void football()
	{
		System.out.println("football");
	}
}


public class hierarchialinheritance
{

	public static void main(String[] args)
	{
		type1 ob= new type1();
		ob.category();
		ob.cricket();
		type2 bc=new type2();
		bc.category();
		bc.football();
		

	}

}
