package oops;

class job
{
	private String name;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}



public class encapsulationcocept
{

	public static void main(String[] args) 
	{
	  job ob=new job();
	  ob.setName("Amal");
	  System.out.println(ob.getName());
	  ob.setDesignation("Testing Intern");
	  System.out.println(ob.getDesignation());
	  

	}

}
