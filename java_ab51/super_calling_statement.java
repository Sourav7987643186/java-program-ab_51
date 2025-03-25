package ab51;
class Amazon2
{
	Amazon2()
	{
		System.out.println("This is my grand parent constructor");
	}
}
class Amazon1 extends Amazon2
{
	Amazon1()
	{
		System.out.println("This is my parent constructor");
	}
}
public class super_calling_statement extends Amazon1

{
	super_calling_statement()
	{
		// super();           //  no need to write, its always present, due to this its calling parent class object i.e. Amazon1, 
		System.out.println("This is my child constructor");
	}

	public static void main(String[] args)
	{
		new super_calling_statement();

	}

}
