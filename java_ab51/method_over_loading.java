package ab51;


/*
 *  Method overloading: 
Developing multiple methods with the same name but variation in the argument list is called method overloading.

. we can overload both static as well as non-static method.
. Order of occurrence of data type should be different
. Number of argument should be different

*/


public class method_over_loading 
/*
{
	static void add(int a)
	{
		System.out.println();
	}
	static void add(int a)
	{
		System.out.println();
	}
	public static void main(String[] args) {
		

	}
	
	*/

{
	method_over_loading ()
	{
		System.out.println("This is constructor 1");
	}
	
	method_over_loading (int a)   // method_over_loading -- is the initialization and (int a) is the declearation 
	{
		System.out.println("This is constructor 2");
	}
	method_over_loading (int a,double b)
	{
		System.out.println("This is constructor 3");
	}
	method_over_loading (int a,double b, short c)
	{
		System.out.println("This is constructor 4");
	}
	public static void main(String[] args)
	{
		method_over_loading n=new method_over_loading();  // syntax of creating new object
		method_over_loading n1=new method_over_loading(22);
		method_over_loading n2=new method_over_loading(22, 23.33);
		method_over_loading n3=new method_over_loading(24, 23.44);
		
		// or
		

		new method_over_loading();    // syntax of creating new object
		new method_over_loading(22);   // For calling 2nd constructor, we need to and any "int" value inside the non static class name
		new method_over_loading(23,23.33);
		new method_over_loading();
		
		/*
		constructor overloading - - - - Developing multiple constructors with different arguments list, is called as constructor over loading.
	    Method overloading:    -------- Developing multiple methods with the same name but variation in the argument list is called method overloading.

			. we can overload both static as well as non-static method.
			. Order of occurrence of data type should be different.
			. Number of argument should be different.
			
			
		What is the difference between method overloading and constructor over loading ?
		  
			1. in Method overloading we can overload both static and not static method.
			but 
			   in constructor overloading we can overload only my constructor.
			
			2. in method overloading we can only overload which have return Type. (Ex- void should present in the parameter)
			but 
			   in constructor overloading we can overload only which do not have return Type.
			3. 
				
				*/
		
	}
}



