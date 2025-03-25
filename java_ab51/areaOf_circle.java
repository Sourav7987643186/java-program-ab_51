package ab51;
import java.util.Scanner;

public class areaOf_circle 
{
// area of a circle   pi*r*r

	

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner (System.in);
		final double Pi = 3.14;
		
		System.out.println("Enter the radious of a circle");
		double a= s1.nextDouble();
		
		multiplication(a*a);
		s1.close();
		
		
		
	}

private double pi;

	    static void multiplication(double a) 
	{
	    System.out.println("areaOf_circle");
		areaOf_circle g=new areaOf_circle();
		double area=g.pi*a*a;
		
	}

}
