package ab51;

public class global_variable2 
{

	double pi=3.14;      // this is a non static variable. to print the value we have to 1. create an object
	static double r=10;                                                        //        2. mention the object with reference variable
	                                                                           //        3. mark the value of a reference variable 
	public static void main(String[] args) 
	{
		System.out.println("The area of the circle");
		global_variable2 g=new global_variable2();
		double area=g.pi*r*r;
		System.out.println(area);

	}

}
