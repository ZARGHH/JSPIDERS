package simple.java;

public class Sample {
	int a=20;
	 static int b=30;
	void Display()
	{
System.out.println("i am displaying");
	}
	 static void write()
	{
		System.out.println("i am writing");
	}

	public static void main(String[] args) 
	{
System.out.println("MAIN METHOD STARTED");

System.out.println(b);
	
	write ();
	Sample s1=new Sample();
	System.out.println(s1.a);
	s1.Display();
	}
	static class MainRunner
	{
		public static void main(String args[])
		{
			System.out.println(Sample.b);
			Sample.write();
			Sample s1=new Sample();
			System.out.println(s1.a);
			s1.Display();
		}
	}

}
