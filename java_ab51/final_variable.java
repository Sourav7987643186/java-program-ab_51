package ab51;

public class final_variable 
{
	static void areaofcircle()
	{
		final double pi=3.14;    // which value is final in nature, for mentioning here we have to write "final". 
		int radius=7;
	//	pi=5;                   // Here this "pi" value won't affect the global value. bcoz of we declare final pi value.
		double area=pi*radius*radius;
		System.out.println(area);
	}
	public static void main(String[] args) 
	{
		areaofcircle();	

	}

}
