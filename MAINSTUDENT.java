package simple.java;

class student
{
	int id;
	String name;
	double per;
	static long colgcode;
	void studentinfo()
	{
		System.out.println("id is"+id);
		System.out.println("Student name is"+name);
		System.out.println("percentage is"+per);
		System.out.println("COLLEGE CODE IS"+colgcode);
	}
}


public class MAINSTUDENT {

	public static void main(String[] args) {
	
	long colgcode=7200l;
		student s1=new student();
s1.id=1;
s1.name="ZAYN";
s1.per=70.5;
System.out.println("****************************");
student s2=new student();
s2.id=2;
s2.name="ayan";
s1.per=68.2;
System.out.println("****************************");
student s3=new student();
s3.id=3;
s3.name="ayaz";
s3.per=75.6;
System.out.println("****************************");
s1.studentinfo();
System.out.println("****************************");
s2.studentinfo();
System.out.println("****************************");
s3.studentinfo();
System.out.println("****************************");
System.out.println("MAIN METHOD ENDED");
	}

}
