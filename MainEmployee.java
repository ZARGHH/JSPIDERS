package simple.java;
class Employee
{
	int id;
	String name;
	double sal;
	
	void work()
	{
		System.out.println(name+"employee is working");
	}
	void empinfo()
	{
		System.out.println("employee id is"+id);
		System.out.println("employee name is "+name);
		System.out.println("employee salary is"+sal);
	}
}





public class MainEmployee {

	public static void main(String[] args) {
System.out.println("MAIN METHOD STARTED");
	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();
	
	e1.name="zargham";
	e1.sal= 34500.56;
	e1.id=12;
	
	e2.name="farhan";
	e2.sal=12345.60;
	e2.id=13;
	
	e1.work();
	e1.empinfo();
	System.out.println("-------------------------");
	e2.work();
	e2.empinfo();
	System.out.println("*******************************");
	e3.work();
	e3.empinfo();
	System.out.println("MAIN METHOD ENDED");
	
	
	
	
	}

}
