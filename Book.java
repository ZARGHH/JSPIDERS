package simple.java;

class Book1
{
	String bname;
	double price;
	int pages;
	 void write()
	 {
		 System.out.println("writing");
	 }
	 
	 void read()
	 {
		 System.out.println("Reading");
	 }
}








public class Book {

	public static void main(String[] args) 
	{
System.out.println("main method started");
	Book1 b1=new Book1();
	System.out.println("bname is"+b1.bname);
	System.out.println("price is"+b1.price);
	System.out.println("pages is"+b1.pages);
	b1.write();
	b1.read();
	System.out.println("main method ended");
	
	}

}
