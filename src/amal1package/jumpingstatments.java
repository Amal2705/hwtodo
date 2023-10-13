package amal1package;

public class jumpingstatments 
{

	public static void main(String[] args) 
	
	//break
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				//break;
				continue;
			}
			{
				System.out.println(i);
			}
		}
		System.out.println(sum());

	}
	public static  int sum()
	{
	int a=10,b=11,c;
	c=a+b;
	
	return c;
	}
	
	

}


