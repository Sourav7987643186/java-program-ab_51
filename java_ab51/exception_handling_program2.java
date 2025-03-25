package ab51;
import java.util.InputMismatchException;
import java.util.Scanner;
public class exception_handling_program2 
{
	public static void main(String[] args) 
	{
		try
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age= s1.nextInt();
		}
		catch (InputMismatchException m1)
		{
			try
			{
			Scanner s1=new Scanner(System.in);
			System.out.println("Please enter your age and must be only number 1");
			int age= s1.nextInt();
			}
			catch (InputMismatchException m2)
			{
				Scanner s1=new Scanner(System.in);
				System.out.println("Please enter your age and must be only number 2");
				int age= s1.nextInt();
				}
			try
			{
			Scanner s1=new Scanner(System.in);
			System.out.println("Please enter your age and must be only number 3");
			int age= s1.nextInt();
			}
			catch (InputMismatchException m3)
			{
				Scanner s1=new Scanner(System.in);
				System.out.println("Please enter your age and must be only number 4");
				int age= s1.nextInt();
				}
		}
		

	}

}
