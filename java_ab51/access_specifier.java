package ab51;

public class access_specifier 
{/*
	       Access specifier :>>-
	 It can only decide weather we access it or not.
	 * types: 4
	 * 1. public
	 * 2. private
	 * 3. package/ default
	 * 4. protected
	 * 
	 * it can be present for     *******
	 * methods              abstract method    concrete methods      static     non-static     constructors
	 * classes              abstract classes   concrete class
	 * interface            abstract interface  concrete class 
	 * variables           Encapsulation   **
	 * 
	 * how the role of the access specifier with all methods ??
	 * 
	 *  methods :>
	 *                    what happen        what happen      what happen outside      what happen outside  
	 *                with in the class     inside package     the package by becoming  the package without becoming 
	 *                                                           the subclass            the subclass
	 * 1. public           True              True                True                        True
	 * 2. protected        True              True                True                        False
	 * 3. package/ default True              True                False                       False
	 * 4. private          True              False               False                       False
	 * 
	 * 
	 * true - - > we can access it
	 * false - -> we can't access it
	 * 
	 *  classes :>
	 *  
	 * how the role of the access specifier with all classes ??
	 * public                   True          
       protected                False
       package/ default         True 
       private                  False
	 * 
	 * what is the meaning of a class which is public ?
	 * any class which is public can be accessible within the package and outside the package
	 * 
	 * what is the meaning of a class which is default/package ?
	 * any class which is  default/package can be accessible within the package only.
	 * 
	 * next >>
	 * Created new package name: ab51_a , 2 different class , student and teacher
	 * 
	 * interface :>

	 * public          true
       protected       false
       package/ default true
       private           false
       
	 * we can not access any interface whose access specifier is protected and private
	 *
	 * what is the meaning of a class which is public ?
	 * any interface which is public can be accessable within package and outside the package.
	 * 
	 * what is the meaning of a class which is default/package ?
	 * any interface which is default/package can be accessable within package only.
	 * 
	 * abstract methods
	 * 
	 * public          
       protected       
       package/ default 
       private           
	 * 
	 * 
	 * Variable topic will be done in 40 the classes.
	 * 
	 */
	public static void main(String[] args) 
	{
	}
}
