package Package1;

public class Student {
	
	int rollno, age;
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
   public void display2() 
   {
	System.out.println("Automation is very easy");
	}

   public static void main(String[] args)
   {
	Student obj1=new Student();
	obj1.age = 23;
	obj1.rollno = 12;
	obj1.display1();
	obj1.display2();
	System.out.println("print roll no" + obj1.rollno);
	System.out.println("print age" + obj1.age);
	
}

}
