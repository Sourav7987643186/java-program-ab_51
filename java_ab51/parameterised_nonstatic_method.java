package ab51;

public class parameterised_nonstatic_method 
{
	void add(int a,int b)
	{
		System.out.println("addition");
	}
	void substract(int c,int d)
	{
		System.out.println("Substract");
	}
	void multiply(int e,int f)
	
	{
		System.out.println("Multiply");
	}
	
	public static void main(String[] args) 
	{
		
		parameterised_nonstatic_method  n=new parameterised_nonstatic_method ();
		n.add(10,50);
		
		parameterised_nonstatic_method n1=new parameterised_nonstatic_method ();
		n1.substract(100,50);
		
		parameterised_nonstatic_method n2=new parameterised_nonstatic_method ();
		n2.multiply(100,50);
		
		
		/*
		 *  Method overloading: 
		Developing multiple methods with the same name but variation in the argument list is called method overloading.
		
		.   we can overload both static as well as non-static method.
        */
	}

}
