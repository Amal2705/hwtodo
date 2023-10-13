package oops;



class member

{
	String Name;
	int age;
	long phoneno;
	String address;
	int salary;
	
	public void Details()
	{
		System.out.println("name= "+Name);
		System.out.println("age= "+age);
		System.out.println("phoneno= "+phoneno);
		System.out.println("address= "+address);
		System.out.println("salary= "+salary);
		
	}
	
	
}
class employee1 extends member
{
	
	String specilization;
}

class manager extends member
{
	String department;
}

public class inheritancepractice 
{

	public static void main(String[] args) 
	{
	employee1 ob=new employee1();
	ob.Name="amal";
	ob.age=21;
	ob.address="pullelimeenathathil edk";
	ob.phoneno=8943929432L;
	ob.salary=30000;
	ob.Details();
	
	System.out.println(ob.specilization="QA INTERN");
	
	manager ba=new manager();
	ba.Name="arun";
	ba.age=27;
	ba.address="pml edk";
	ba.phoneno=8281487680L;
	ba.salary=40000;
	ba.Details();
	
	System.out.println(ba.department="SOFTWARE TESTING");

	}

}
