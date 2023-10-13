package oops;



class vehicle 
{
	public void drive()
	{
		System.out.println("repairing a car");
	}
}

class car1 extends vehicle	

{

	@Override
	public void drive()
	{
		
		super.drive();
	}
}






public class practiceoverriding 
{

	public static void main(String[] args) 
	{
		car1 ob=new car1();
		ob.drive();
	}

}
