package ab51;
// non static to non static method     // Inheritance problem
 class classparent
 {
	 void add()
	 {
		 
	 }
 }
public class studet_class_inheritance1 extends classparent
{
	void sub()
	{
		
	}
	public static void main(String[] args) 
	{
		studet_class_inheritance1 s1=new studet_class_inheritance1();
		
		s1.add();
		s1.sub();
		
	}

}
