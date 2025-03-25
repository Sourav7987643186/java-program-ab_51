package ab51;

public class string_program 
{

	public static void main(String[] args) 
	{
		        String a="School is good";
				String b="Sourav";                 // index is starting from 0.
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		
		        int a1= a.length();
		System.out.println(a1);
		
		        String c="          Sourav     Bhattacharya        ";
		System.out.println(c.charAt(0));
		System.out.println(c.charAt(4));
		
		        String d=("        chennai                 perungudi        ");
		System.out.println(d);
		System.out.println(d.trim());
		
		
		// concat :>>
		
		String input="ghamvir pg ";
		System.out.println(input.concat("  4th floor room no 16"));
		
		

	}

}
