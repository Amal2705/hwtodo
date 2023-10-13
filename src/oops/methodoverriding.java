package oops;

class parent1
{
	public void phone()
	{
		System.out.println("Samsung");
	}
	public void job()
	{
		System.out.println("QA INTERN");
	}
}

class child1 extends parent1
{

	@Override
	public void phone()
	{
		System.out.println("Nothing1");
		super.phone();
	}

	@Override
	public void job()
	{
		System.out.println("HR");
		super.job();
	}
	
}




public class methodoverriding
{

	public static void main(String[] args) 
	{
		child1 ob=new child1();
		ob.phone();
		ob.job();

	}

}
