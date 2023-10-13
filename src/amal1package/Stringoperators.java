package amal1package;

public class Stringoperators
{

	public static void main(String[] args) 
	{
	 //concat
		String s1="  hello amal  ";
		String s2="welcome";
		String s3="Hello amal";
		System.out.println(s1.concat(" "+s2));
		System.out.println(s1+s2);
		System.out.println(1+3+s1+4+3);
		
	//equals
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
	//tolower and to upper
		
		System.out.println(s1.toUpperCase());
		System.out.println(s3.toLowerCase());
	//contains
		System.out.println(s1.contains("amal"));
	//lenght
		System.out.println(s2.length());
	//startswith //endswith
		System.out.println(s1.startsWith("hello"));
		System.out.println(s2.endsWith("welcome"));
		System.out.println(s2.startsWith("welcome"));
	//substring
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(7));
		System.out.println(s1.substring(0,7));
	//trim
		
	System.out.println(s1.trim());
	//split
	String[] sa=s1.split(" ");
	for(String k:sa)
	{
		System.out.println(k);
	}
	
	//replace
	System.out.println(s1.replace("amal", "arun"));
	
	//charAt
	System.out.println(s1.charAt(8));
		
		
		
		
		

	}

}
