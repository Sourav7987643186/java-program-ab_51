package ab51;

import java.util.Scanner;

public class areaOf_triangle 
{
// area of a triangle
	
	public static void main(String[] args) 
		{
			Scanner s1=new Scanner(System.in);
			
			System.out.println("Enter the lenght of a");
			double a= s1.nextDouble();
			
			System.out.println("Enter the lenght of b");
			double b= s1.nextDouble();
			
			multiplication(a , b);
			s1.close();

	}

	private static void multiplication(double a, double b)
	{
		Object multiplication = 0.5*a*b;
		System.out.println(multiplication);	
	}

}
