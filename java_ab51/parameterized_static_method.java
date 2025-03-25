package ab51;

public class parameterized_static_method 
{
	
	// program 1
	
	static void add(int a,int b)
	
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	// program 2
	
	static void student(String name)

	{
		System.out.println(name);
	}
	
	// program 3
	
	static void sub(int a,double b,char c,String name,boolean answer)
	{
		System.out.println(3.2);
	}

	public static void main(String[] args)
	
	{
			add(50,100);
			
			student("Sourav Bhattacharya");
			
			sub(50,3.2,'A',"Sourav",true);
			
		}
		 

	}

