package oops;

public class runtimeexceptionhandling 
{

	public static void main(String[] args)
	{
 
	
		int a=10,b=0;
		try {
		double c=a/b;
		System.out.println(c);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
			
			System.out.println(e.getMessage());
			
		}

		System.out.println("will go to next code");
		
		
		int[] ar=new int[3];
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		try {
			ar[3]=4;
		}
	   catch(ArrayIndexOutOfBoundsException f)
		{
		   System.out.println("Arrayindexoutofbound Exception");
		   System.out.println(f.getMessage());
		   
		   
	   }
		System.out.println("can be continued and can use catch for executing any other code for displaying");
		
	}

}
