//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		System.out.print("Enter an integer :: 2 ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: 3 ");
		intTwo = keyboard.nextInt();


		//add in input for all variables
		System.out.print(" Enter a double :: 4 ");
		doubleOne = keyboard.nextDouble();

		System.out.print(" Enter a double :: 5 ");
		doubleTwo = keyboard.nextDouble();
		
		System.out.print(" Enter a float :: 6 ");
		floatOne = keyboard.nextFloat();
		
		System.out.print(" Enter a float :: 7 ");
		floatTwo = keyboard.nextFloat();
		
		System.out.print(" Enter a short :: 8 ");
		shortOne = keyboard.nextShort();
		
		System.out.print(" Enter a short :: 9 ");
		shortTwo = keyboard.nextShort();
		
		
		
		
		
		
		System.out.println();
		System.out.println("integer one =  " + intOne );
		System.out.println("integer two =  " + intTwo );

		//add in output for all variables
		System.out.println("double one =  " + doubleOne );
		System.out.println("double two =  " + doubleTwo );
		System.out.println("float one =  " + floatOne );
		System.out.println("float two =  " + floatTwo );
		System.out.println("short one =  " + shortOne );
		System.out.println("short two =  " + shortTwo );

	}
}