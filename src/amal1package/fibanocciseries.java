package amal1package;

public class fibanocciseries
{

	public static void main(String[] args)
	{
		int n=11,a=0,b=1;
		System.out.println("fibonacci series till"+n+"terms:");
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(a+",");
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
