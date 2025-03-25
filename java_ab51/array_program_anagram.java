package ab51;
import java.lang.reflect.Array;
import java.util.Arrays;
public class array_program_anagram 
{
	public static void main(String[] args) 
	{
		String s1="moon";
		String s2="suun";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("they are anagram not anagram");
		}
		else
		{
			System.out.println("they are eligable for anagram");
			char c1[]= s1.toCharArray();   // [a,c,t]
			char c2[]= s2.toCharArray();   // [c,a,t]
			
			Array.sort(c1); //[a,c,t]
			Array.sort(c2); //[a,c,t]
			System.out.println("after shorting c1 is->");
			System.out.println(c1);
			System.out.println("after shorting c2 is->");
			System.out.println(c2);
			
			boolean b1= Arrays.equals(c1, c2);
			System.out.println(b1);
			if(b1==true)
			{
				System.out.println("it is anagram");
			}
			else
			{
				System.out.println("it is not anagram");
			}
		}
	}
}


