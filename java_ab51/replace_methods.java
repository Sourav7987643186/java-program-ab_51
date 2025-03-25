package ab51;

public class replace_methods {

	public static void main(String[] args)
	{
		String name="sourav";
		String n1= name.replace('s', 'v');
		System.out.println(n1);
		
		String n2= name.replace('v', 's');
		System.out.println(n2);
		
		
		String name1="AMAZON CHENNAI";
		String n3= name1.replace("oo", "ghamvirpg");
		System.out.println(n3);
		
		String name2="bhattacharya goalpara";
		   String n4= name2.replaceAll("[a-z]", "");
		   System.out.println(n4);
		   
		   String name3="room no 16";
			String n31= name3.replaceAll("[0-z]", "");
			System.out.println(n31);

	}

}
