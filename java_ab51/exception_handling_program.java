package ab51;

public class exception_handling_program 
{

public static void main(String[] args)
{
	try 
	{	
	int a=1/0;
	}
	catch(ArithmeticException a1)
	{
		System.out.println("Handled the exception 1");
	}
	catch(NullPointerException a2)
	{
		System.out.println("Handled the exception2 ");
	}
	
	// a=b/c  
	// b=> >> grand parents class 
	// c >> parents class   

	// whenever tester get any exception in try block, catch will handle the exception and execute the block.
	//
}

	
}

