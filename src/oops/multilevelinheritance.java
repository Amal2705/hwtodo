package oops;

class animal
{
	public void animalname()
	{
		System.out.println("animal name");
		System.out.println("------------");
	}
	
}
class animaltype extends animal
{
	
	
	public void dog()
	{
		System.out.println("dog");
	}
}

class animaltype2 extends animaltype
{
	
	public void elephant()
	
	{
		System.out.println("elephant");
	}
}




public class multilevelinheritance
{

	public static void main(String[] args)
	{
			animaltype2 ob=new animaltype2();
			ob.animalname();
			ob.dog();
			ob.elephant();
			
		
	}

}
