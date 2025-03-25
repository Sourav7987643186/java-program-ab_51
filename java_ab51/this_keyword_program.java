package ab51;

public class this_keyword_program 
{
	String name;       // non static global variable also called instance variable
	double salary;
	int age;
	void student_details(String name,double salary,int age)
	{
		this.name=name;           // assigning operator   // this.globalvariable=localvariable
		System.out.println("Hi my name is ->"+name);
		this.salary=salary;        // assigning operator
		System.out.println("My salary is ->"+salary);
		this.age=age;              // assigning operator
		System.out.println("Hi my age is->"+age);
	}
	public static void main(String[] args) 
	{
		this_keyword_program m1=new this_keyword_program();
		m1.student_details("sourav", 24, 30);
		System.out.println(m1.name);
		System.out.println(m1.salary);
		System.out.println(m1.age);
	}
}
