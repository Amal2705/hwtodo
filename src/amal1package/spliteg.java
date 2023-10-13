package amal1package;

public class spliteg 
{

	public static void main(String[] args)
	{
	String a1="Testing Training Center";
	String[] a2=a1.split(" ");
	for(int i=a2.length-1;i>=0;i--)
	{
      System.out.print(a2[i]+" ");
	}
	}
}
