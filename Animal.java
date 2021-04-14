package simple.java;

class Carnivorus
{
	String name;
	int legs;
	String type;
	String nature;
	
	void nature()
	{
		System.out.println("it is carnivorous animal");
		
	}
	void eat()
	{
		System.out.println("they eat meat");
	}
}



public class Animal {

	public static void main(String[] args) {
System.out.println("MAIN METHOD STARTED");
Carnivorus sc=new Carnivorus();
System.out.println("the name of the animal is"+sc.name);
System.out.println(" the number of leg it has "+sc.legs);
System.out.println("the type of animal is"+sc.type);
System.out.println("the nautre of animal is "+sc.nature);
sc.nature();
sc.eat();
System.out.println("MAIN METHOD ENDED");


	}

}
