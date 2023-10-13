package oops;

abstract class Car
{
	
	abstract public void acceleration();
	abstract public void speedlimit();
	
	public void musicsystem()
	{
		System.out.println("music system details");
	}
}

class Bmw extends Car
{

	@Override
	public void acceleration() 
	{
		System.out.println("acceleration details of BMW");
		
	}

	@Override
	public void speedlimit() 
	{
		System.out.println("speed limit of BMW");
		
	}
	
	
}

class Duster extends Car
{

	@Override
	public void acceleration() 
	{
		System.out.println("acceleration details of DUSTER");
		
	}

	@Override
	public void speedlimit() 
	{
		System.out.println("speed limit of DUSTER ");
		
	}
	
}



public class abstraction {

	public static void main(String[] args)
	{
	 Bmw ob=new Bmw();
	 ob.acceleration();
	 ob.speedlimit();
	 ob.musicsystem();
	 
	 Duster ob2=new Duster();
	 ob2.acceleration();
	 ob2.speedlimit();
	 ob2.musicsystem();
	 

	}

}
