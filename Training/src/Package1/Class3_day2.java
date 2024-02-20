package Package1;

public class Class3_day2 {

	
	public float sum(float a, float b) 
	{
	float c;
	c = a+b;
	return c;
	}
	public float sub(float a, float b) 
	{
	float c;
	c = a-b;
	return c;
	}
	public float div(float a, float b) 
	{
	float c;
	c = a/b;
	return c;
	}
	public static void main(String[] args) {
		
	Class3_day2 obj = new Class3_day2();
	float divresult=obj.div(10, 2);
	float subresult = obj.sub(divresult, 2);
	float sumresult = obj.sum(subresult, 2);
	float subresult1 = obj.sub(sumresult, 2);
	float divresult2 = obj.div(subresult1, 2);
	System.out.println("final result " + divresult2);
	}
	
	

}
