package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class compiletimeexceptionhandling {

	public static void main(String[] args) throws FileNotFoundException
	{
		try {
		FileInputStream ob=new FileInputStream("a.;");
				
		}
		catch(FileNotFoundException a )
		{
			
			System.out.println("filenot found exception");
			System.out.println(a.getMessage());
		}
		System.out.println("compiletime exception handled");
		
	}

}
