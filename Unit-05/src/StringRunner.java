//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		StringOddOrEven test = new StringOddOrEven();
		
	System.out.println("Enter a string :: ");
	String name = keyboard.nextLine();
	test.StringOddOrEven(name);
	System.out.println(test.toString());
		
	}
}