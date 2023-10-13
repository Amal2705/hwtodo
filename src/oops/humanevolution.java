package oops;

class Monkey
{
	public void jump()
	{
		System.out.println("jump");
		
	}
	
	public void bite()
	{
		System.out.println("bite");
	}
		
}

interface Basicanimal
{
	
	public void eat();
	public void sleep();

}

class Human extends Monkey implements Basicanimal
{
    public void speak() 
    {
    	System.out.println("speak");
    }
	
	
	@Override
	public void eat()
	{
		System.out.println("eat");
		
	}

	@Override
	public void sleep() 
	{
		System.out.println("sleep");
		
	}
	
}


public class humanevolution 
{

	public static void main(String[] args)
	{
	Human ob=new Human();
	ob.jump();
	ob.bite();
	ob.eat();
	ob.sleep();
	ob.speak();
  
	}

}
