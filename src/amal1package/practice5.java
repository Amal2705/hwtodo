package amal1package;

public class practice5
{

	public static void main(String[] args) 
	{
		// palindrome
		
		int n=121;
		int temp=n;
		
		int r;
		int s=0;
		while(n>0)
		{
			r=n%10; //5  //3      //0
			s=s*10+r;  //5  //53   //530
			n=n/10;  //13  //1      //0.
		}
  System.out.println(s);
  
  if(temp==s)
  {
	  System.out.println("paldrome");
	  
  }
  else
  {
	  System.out.println("notpaldrome");
  }
	}

}
