package ab51;

//    OR Operator

public class or_operator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=100;
		int b=300;
		
		if(a>b || b>a)
		{
			System.out.println("Block execute");
		}
		}
	}


/*
con1       con2     o/p
T           T        T
T           F        T
F           T        T
F           F        F

|| is the symbol OR operator

if(a>b || b>a)
*/