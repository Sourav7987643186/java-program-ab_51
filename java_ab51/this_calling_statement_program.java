package ab51;

public class this_calling_statement_program 
{
	this_calling_statement_program()
	{
		this ("Hello");
		System.out.println("1");
	}
	this_calling_statement_program(String a)
	{
		this ('a');
		System.out.println("2");
	}
	this_calling_statement_program(char b)
	{
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
		new this_calling_statement_program();
	}

}
