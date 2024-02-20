package Package1;

public class Class3_day1 {
	
	public int sum(int a, int b) 
	{
	int c;
	c = a+b;
	System.out.println("sum " + c);
	return c;
	}
	public int sub(int a, int b) 
	{
	int c;
	c = a-b;
	System.out.println("sub " + c);
	return c;
	}
	public void div(int a, int b) 
	{
	int c;
	c = a/b;
	System.out.println("final result " + c);
	}
	public int multi(int a, int b) 
	{
	int c;
	c = a*b;
	System.out.println("multi " + c);
	return c;
	}
	public static void main(String[] args) {
	
	Class3_day1 obj = new Class3_day1();
	int sumresult = obj.sum(10, 2);
	int sumresult1 = obj.sum(sumresult, 2);
	int minusresult = obj.sub(sumresult1, 2);
	int multiplereuslt = obj.multi(minusresult, 2);
	obj.div(multiplereuslt, 2); 	
}
}
