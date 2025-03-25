package ab51;
import java.util.Scanner;
public class scannerClass_problem 
{
// circumference of a triangle
	
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the lenght of a");
		double a= s1.nextDouble();
		
		System.out.println("Enter the lenght of b");
		double b= s1.nextDouble();
		
		System.out.println("Enter the lenght of c");
		double c= s1.nextDouble();
		
		add(a,b,c);
		s1.close();	
	}

	      static void add(double a,double b, double c) 
	{
			double sum= a+b+c;
			System.out.println(sum);
		}
}





/*

                           Circle             Triangle              Rectangle              Square

Find the       area       pi*r*r              0.5*b*h                l*b                    a*a
           Circumferance  2*pi*r              a+b+c                  2(a+b)                 4*a 



*/