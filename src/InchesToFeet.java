/*Write a program that declares a variable named inches, which holds a length
in inches, and assign a value. Display the value in feet and inches; for example,
86 inches becomes 7 feet and 2 inches. Be sure to use a named constant where
appropriate. Save the program as InchesToFeet.java.*/


public class InchesToFeet 
{
	public static void main (String [] args)
	{
		final double FEET_IN_INCHE = 0.0833333;
		
		int inches = 500;
		int feet;
		int inchesReminder;
		
		 feet = (int) (inches * FEET_IN_INCHE);
		 inchesReminder = inches % (int) FEET_IN_INCHE;
		 
		 System.out.println(feet);
		
	}
}
