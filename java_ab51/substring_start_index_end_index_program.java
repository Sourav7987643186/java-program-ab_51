package ab51;
import java.util.Date;
// Find out the current time,past time and future time
public class substring_start_index_end_index_program 
{
public static void main(String[] args) 
	{
		Date d1=new Date();  // don not select java.sql package here
		System.out.println(d1);
		          //  d1+(1000+60+60+24+1);
		Date d2=new Date();
		d2.getTime();
		System.out.println(d2.getTime());
		//DD-MM-YYYY
		//DD/MM/YYYY
		//1
		String format d1.toString();
		
		String date= format.substring(8, 11);
		System.out.println(date);

		String month= format.substring(4, 7);
		System.out.println(month);
			
		String year= format.substring(24, 28);
		System.out.println(year);
		
		
		String year1= format.substring(format.length()-4);
		System.out.println(year1);
		
		/*//2
		String formate11= d1.toString();
		
		String date11= formate11.substring(8, 11);
		System.out.println(date11);
*/
		
		
		// epoch time >> 
	}

}
