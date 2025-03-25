package ab51;
import java.util.Arrays;
public class array_program 
{

	public static void main(String[] args)
	{
		int []age=new int[4];
		age[0]=45;
		age[1]=27;
		age[2]=21;
		age[3]=31;
		Arrays.sort(age);   // by this we can arrange it in incremental manner
		System.out.println(Arrays.toString(age));
		

	}

}
