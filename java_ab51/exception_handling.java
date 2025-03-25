package ab51;
public class exception_handling  
{/*Exception Handling ::>>
     l;Sometime as a tester we can get different result from the expected result. For that different result sometime we don't have any option to 
	 change the code to fix it. In that situation we used some methods to fix it, that is called exception handling.
	 * 
	 * Exception handling is a programming technique that allows a program to respond to errors and continue running. 
	 * It helps prevent a program from crashing when unexpected events occur. 
	 * When do exceptions occur? 
Invalid user input
Code errors
Device failure
Loss of network connection
Insufficient memory
Memory conflict with another program
Attempting to divide by zero
Attempting to open unavailable files
	 * 
	 * note have to create : to be noted:>>  
	 * 
	 * ******                how to handle ?         mandatory ?           what they are called as?    inheritance    example
	 *  Compile time     Throws, try and catch     mandatory                 Checked exception                             
	 *  Run time         try and catch             Not mandatory            un-checked exception                    Arithmathic, nullpointer, inputmismatch
	 *  
	 *   PPT have details note
	 *   
	 *   
	 * Exception are checked or unchecked.
	 * If checked means > its a compile time error
	 * If unchecked means > its a run time error
	 * 
	 * 1. exception_handling can be done by using 3 blocks. "try", "catch" and "finally" block.   **
	 * 2. which ever line is giving exception keep it in the try block.
	 * 3. And handle that exception in catch block.
	 * 4. Writing try and catch does not guarantee the exception must come, it may come or not come.
	 * 5. If exception come >>> means then catch block will execute
	 * 6. If exception not come means >> then try block will execute
	 * 7. For a single try there is a need of mandatory one catch or it can have any number of catches block.
	 * 8. If exception come then only catch block will execute, otherwise only try block will execute.
	 * 
	 * 
	 * whenever tester get any exception in try block, catch will handle the exception and execute the block.
	 * 
	       Final keyword: 
	 * 1. it can be used for variables, methods, and class 
	 * 3. any method which is final can not be changed, overridden, inherited. 
	 * 
	       Finally keyword: 
	 * 1. finally keyword can be used in the case of exceptional handling, where tester don't know which block will execute,
	 * but finally block is always executing.
	 * 2. variables, methods, and class can not be finally.
	 * 
	       Throw keyword: 
	 * 1. throw keyword can be useful throwing an exception.
	 * 2. syntax: 
	 * throw new ecxeptionName("message");
	 * 3.It also a way to terminate the program.
	 * 4. throws an exception
	 * 5. it should be written inside the method.
	 * 6. it is not helpful to handle checked exception.
	 * 
	 * 
	        Throws keyword :
	 * 1. declaring an exception.
	 * 2. it should be written together with the method name. (with anything)
	 * 3. it helpful to handle checked exception.
	 *
	 */
	public static void main(String[] args) 
	{
	}
}
