package oops;

interface Calculatoroperators
{
	public void add();
	public void sub();
}

interface Advcalculatoroperators
{
	
	public void squareroot();
}

class Calculator implements Calculatoroperators,Advcalculatoroperators
{
	public void add() 
	{
		System.out.println("to add");
	}
	
	public void sub()
	{
		System.out.println("to subtract");
	}
	
	public void squareroot()
	{
		System.out.println("to find the squareroot");
	}
}





public class interfaceconcept
{

	public static void main(String[] args)
	{
	 Calculator ob=new Calculator();
	 ob.add();
	 ob.sub();
	 ob.squareroot();
	}

}
