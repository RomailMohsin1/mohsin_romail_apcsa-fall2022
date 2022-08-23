//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		//add test cases
		Distance Test = new Distance();
		
		out.print("Enter x1 :: ");
		int x1 = keyboard.nextInt();
		
		out.print("Enter x2 :: ");
		int x2 = keyboard.nextInt();
		
		out.print("Enter y1 :: ");
		int y1 = keyboard.nextInt();
		
		out.print("Enter y2 :: ");
		int y2 = keyboard.nextInt();
		Test.setCoordinates(x1, x2, y1, y2);
		Test.calcDistance();
		Test.print();
		
		
			
	}
}