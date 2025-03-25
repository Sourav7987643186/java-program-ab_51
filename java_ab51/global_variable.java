package ab51;

public class global_variable
{
		static int a=100;   // global variable
		static int b=200;   // global variable   //can be used in everywhere, from the start of the class to end of the class
		
		static void addition()
		{
			int c=10;           // local variable   // can be used only inside any method.
			System.out.println(a+b);
		}
		static void subtraction()
		{
			System.out.println(a-b);
		}
		static void multiplication()
		{
			System.out.println(a*b);
		}
		
public static void main(String[] args)
		{
		addition();
		subtraction();
		multiplication();
		}
	
		
	}

