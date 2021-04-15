package simple.java;
class PAN
{
	String colour;
	Double price;
	void write()
	
	{
		System.out.println("the colour  of the pen is"+colour);
	}
}



public class MainPen {

	public static void main(String[] args) {
System.out.println("MAIN METHOD STARTED");
	
	PAN p1=new PAN();
	PAN p2=new PAN();
	p1.colour="red";
	p1.price=23.5;
	p2.colour="blue";
	p2.price=34.5;
	
	p1.write();
	System.out.println("_________________________");
	p2.write();
	System.out.println("____________________");
	
	System.out.println("MAIN METHOD ENDED");
	}

}
