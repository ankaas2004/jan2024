package Package1;

public class Class4_day2 {

	
	public void m1() 
	{
		System.out.println("defualt method");
	
	}
	public void m2(int x)
	{
		System.out.println("one parameterized method");
	
	}
	public void m3(int x, int y)
	{
		System.out.println("two parameterized method");
	
	}
	public void m4(int x, int y , int z)
	{
	System.out.println("three parameterized method");
	this.m5(1, 2, 3, 4);
	this.m1();
	this.m2(1);
	this.m3(2, 3);
		
	}
	public void m5(int x,int y, int z, int t)
	{
		System.out.println("four parameterized method");
	
	}
 	 public static void main(String[] args)
 	{
	Class4_day2 obj = new Class4_day2();
	obj.m4(1,2,3);
	}
	
}



