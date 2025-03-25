package ab51;

public class match_function {

	public static void main(String[] args) 
	{
	String a= "sourav";
	boolean b1= a.matches(".....");  
	System.out.println(b1);
	//string end with 'v'
	boolean b2= a.matches("(.)*v");    //  (.)*   >>>   rigix function
	System.out.println(b2);
	//string start with 's'
	boolean b3= a.matches("s(.)*");
	System.out.println(b3);

	}

}
