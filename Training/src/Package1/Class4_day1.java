package Package1;

public class Class4_day1 
{
	
	public Class4_day1() 
	{
		this(1,2,3);
		System.out.println("defualt constructor");
		
		
	}
	public Class4_day1(int x)
	{
		this();
		System.out.println("one parameterized constructor");
	
	}
	public Class4_day1(int x, int y)
	{
		this(1);
		System.out.println("two parameterized constructor");
	
	}
	public Class4_day1(int x, int y , int z)
	{
		System.out.println("three parameterized constructor");
	
	}
	public Class4_day1(int x,int y, int z, int t)
	{
		this(2,3);
		System.out.println("four parameterized constructor");
	
	}
 	 public static void main(String[] args)
 	{
	Class4_day1 obj = new Class4_day1(1,2,3,4);
	}
	
}


