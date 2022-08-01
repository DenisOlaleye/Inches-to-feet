/*Write a program that declares a variable named inches, which holds a length
in inches, and assign a value. Display the value in feet and inches; for example,
86 inches becomes 7 feet and 2 inches. Be sure to use a named constant where
appropriate. Save the program as InchesToFeet.java.*/
import java.util.Scanner;

public class InchesToFeet 
{
	public static void main (String [] args)
	{
		
		final int INCHE_IN_FEET = 12;
		Scanner input = new Scanner(System.in);
		
		int feet;
		int inchesReminder;
		
		System.out.print("Enter the inches >> ");
		int inches = input.nextInt();
		
		
		
		feet = inches/INCHE_IN_FEET;
		inchesReminder = inches % INCHE_IN_FEET;
		
		System.out.println(inches+ " inches becomes " +feet+ " feet and " +inchesReminder+ " inches.");
		
		
				
		
	}
}
