package ab51;

public class static_initialization_block_and_instance_initialization_block_program 
{
	static   // SIB
	{
		System.out.println("SIB 1");
	}
	static   // SIB
	{
		System.out.println("SIB 2");
	}
	static   // SIB
	{
		System.out.println("SIB 3");
	}
	
	{
		System.out.println("IIB 1");    // IIB
	}
	{
		System.out.println("IIB 2");    // IIB
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method 1");
		new static_initialization_block_and_instance_initialization_block_program();  
		
		// by this method only we can execute IIB.
		//new program name();
		
		
		// SIB will execute 1st, then  main method 2nd, then IIB
       //	main method always execute in second. 
	}
	{
		System.out.println("Main Method 2");
	}
}
