package ab51;

public class NonStaticMethod_program 
{
	
	void add()
	{
		int a=10;                       
		int b=20;
		System.out.println("a+b");
	}
	void sub()
	{
		int a=10;                       
		int b=20;
		System.out.println("a-b");
	}
	void mul()
	{
		int a=10;                       
		int b=20;
		System.out.println("a*b");
	}


	public static void main(String[] args) 
	{

		NonStaticMethod_program n=new NonStaticMethod_program ();    // created an non static object
		n.add();
		n.sub();
		n.mul();
		
		// we can create multiple object multiple number of time 
		// class name and non static object name should be same
		// whatever we want to execute, we have to call inside non static method	
	}

}
