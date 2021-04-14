package simple.java;

class Source
{
	double price;
	String cname;
	String Type;
	String durablity;
	
	void write()
	{
		System.out.println("Writing");
		
	}
	void draw()
	{
		System.out.println("Drawing");
	}
}



public class PEN {

	public static void main(String[] args) {
System.out.println("main method started");
Source sc=new Source();
System.out.println ("price is"+sc.price);
System.out.println ("cname  is"+sc.cname);
System.out.println("pen type is"+sc.Type);
System.out.println ("Duarbilty is"+sc.durablity);
sc.write();
sc.draw();
System.out.println("main method ended");



	}

}
