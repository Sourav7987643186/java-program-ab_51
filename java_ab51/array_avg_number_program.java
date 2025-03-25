package ab51;
// average of 4 number
public class array_avg_number_program 
{
	public static void main(String[] args) 
	{
		double []age=new double[4];
		age[0]=10;
		age[1]=11;
		age[2]=12;
		age[3]=13;
		double sum=0;
		double average=0;
		
		for(double i=0;i<=3;i++)
		{
			sum=sum+ age[(int) i];
		}
		System.out.println(sum);
		average=sum/age.length;
		System.out.println(average);
	}
}


