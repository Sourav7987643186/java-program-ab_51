package ab51;
class Google_Auth
{
	final void login()             // final method declare 
	{
		System.out.println("Login in gmail using mobile number");
	}
}
   public class super_keyword_program  extends Google_Auth
{
	void login_with_email_id()
	{
		// super.login();                  // this is called super calling keyword   
		System.out.println("Login using email id");
		
	}
	public static void main(String[] args) 
	{
		
		super_keyword_program m1=new super_keyword_program ();
		m1.login();
	}	
	}
