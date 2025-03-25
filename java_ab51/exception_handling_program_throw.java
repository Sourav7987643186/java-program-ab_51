package ab51;
import java.util.InputMismatchException;
public class exception_handling_program_throw 
{

	public static void main(String[] args) throws NullPointerExeception,InputMismatchException // syntax of throws keyword
	{
		if(1>3)
		{
		throw new NullPointerExeception();    // syntax of throw keyword
		}
		else
		{
		throw new InputMismatchException();
		}
	}

}
