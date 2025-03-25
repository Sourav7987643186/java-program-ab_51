package ab51;

public class array_index_program 
{

	public static void main(String[] args) 
	{
		String input=("school name is BHS");
			String s1=	input.substring(4);
			System.out.println(s1);   // 4 selective i/p was not printed
			
			String s2= input.substring(0, 6);   // only selected number will show
			System.out.println(s2);
	}

}
