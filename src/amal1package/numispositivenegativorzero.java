package amal1package;

import java.util.Scanner;

public class numispositivenegativorzero 
{

	public static void main(String[] args) 
	{
		
		int[]a = {1,-1,-3,-5,0,8,9,0};
				
	int	poscount=0;
	int	negcount=0;
	int	zerocount=0;
	for(int num:a)
	{
		if(num>0)
		{
		poscount++;
		}
		else if(num<0)
		{
			negcount++;
		}
		else
		{
			zerocount++;
		}
		
		
	}
	
	System.out.println("positivecount="+poscount);
	System.out.println("negativecount="+negcount);
	System.out.println("zerocount="+zerocount);
	
		

	}

}
