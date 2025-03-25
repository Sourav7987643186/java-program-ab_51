package ab51;

public class variables 
{

	public static void main(String[] args) 
	{
		/*
		 * >> variables << :
		 * int a= 100 >> // here a= variable && 100 is data types. Variable is like a container. In variable data type is stored.
		 * Types : 
		 * 1. local variable
		 * 2. Global variable
		 * 3. Final Variable
		 * 
		 * >>>>>>>>>>>>>>>>>
		 * 1. local variable :-->
		 * >>>>>>>>>>>>>>>>>
		 * Any variable which is declare inside any method is called as local variable.
		 * 
		 * ex. 
		 * 1. void and()   // >> local variable
		 * {
		 * int a= 100;   
		 * }
		 * 
		 * 2. static void main()   //  >> local variable 
		 * {
		 * int a=90:
		 * }
		 * it can be constructed, main method, static or not static, parameterized or non parameterized, 
		 *
		 * 2. the scope of local variable will only be from the start of the method to till the end of a method. It means that outside the method this local variable is not be recognized.
		   Ex. 
		   {
		 * int a= 100;
		 * }
		  3. local variable can never be distinguished between static and non static. 
	      4. local variable doesn't have any default value.    // like water
		  5. local variable can never be utilized until initialized.
		 Ex.
		 {
		  int a= 100;
		  public static void main(a= 100); // Hare local variable are not initialized.  
		 }       // It never be print any value.
		 
		 ** Any variable brown in color in code is always a >> local variable
		 ** Any variable blue in color in code is always a >> Global variable
		  6. Local variable always take the updated value, even many value store in same data type.
		  
		   >>>>>>>>>>>>>>>>>>>>>>
		   Global variable :-->>
		   >>>>>>>>>>>>>>>>>>>>>>
		   
		   
		1. Any variable which is declare outside all the methods but inside the class, called as Global variable.
			 ex. 
			 
		 * 1. void and() 
		 * Class sourav
		 * { 
		 * int Pi      >> // Global variable    , because it present inside the class
		 * void add()
		 * }
		 * {
		 * int a= 100;  >> local variable
		 * }
		 * 2. static void main()       >> >> // local variable     , because it present inside method 
		 * {
		 * int b=90:
		 * }
		 2. The scope of Global variables will be from start of the class till the end of the class.
		 3. Global variable can be distinguished between static and non static.          **
		 4. Global variable must have the default values.
		 5. Global variable can be utilized without initializing.
		 6. which variable do not have static method is also called "instance variable"
		  ex:
		  package ab51;
          public class global_variable
         {
		static int a=;
		{
			System.out.println(a);
		} 
		}
	//	 Variable         Default value    
		 byte         >>       0
		 short        >>       0
		 int          >>       0
		 long         >>       0
		 double       >>      0.0
		 float        >>      0.0
		 boolean      >>     false
		 char         >>  doesn't have any default value
		 String       >>     null
		 
		 >>>>>>>>>>>>>>>>>>>>>>>>
		 Final variable :-->>
		 >>>>>>>>>>>>>>>>>>>>>>>>
		 
		 1. Any variable which is final in nature will never changed its value. 
		 2. Yes both local and globals variables can be final.
		 3. If local variable is final this value will not be changed throughout the method.
		 4. If global variable is final its value will not be changed throughout the class.
		 ex; 
		 {
		 final int a=100;
		 a =100;    // this is not allowed in java
		 }
		 5. 
		 
		  */
		
		
	}


}
