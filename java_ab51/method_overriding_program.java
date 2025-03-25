package ab51;
class Google_auth
{
	void login()
	{
		System.out.println("Login in gmail using mobile number");
	}
}
public class method_overriding_program extends Google_auth
{
	void login()
	{
		//super.login();
		System.out.println("Login in gmail using email address");
		super.login();
	}

	public static void main(String[] args) 
	{
		method_overriding_program m1=new method_overriding_program();
		m1.login();
		
		
	}

}





