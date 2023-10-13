package oops;

public class Employee {
	int empid;
	String empname;
	String empdesignation;
	
	public Employee(int empid,String empname,String empdesignation)
	{
	     this.empid=empid;
	     this.empname=empname;
	     this.empdesignation=empdesignation;
		
	}
	
	
	public static void main(String[] args)
	{
	Employee emp1=new Employee(01,"Amal","Tester");
     emp1.display();
    Employee emp2=new Employee(02,"Arun","HR");
     emp2.display();
    
	}
	
	public void display()
	{
		System.out.println("empid= "+empid);
		System.out.println("empname= "+empname);
		System.out.println("empdesignation= "+empdesignation);
				
	}
	

}
