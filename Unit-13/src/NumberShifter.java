//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{ 
	private static int[] Lucky7Array;
	
	public static int[] makeLucky7Array( int size)
	{
		size = (int)Math.random() *10;
		
		Lucky7Array = new int[size];
		return null;
	}
	public static void shiftEm(int[] array)
	{
		int counter = 0;
		
		
		for ( int i = 0; i < Lucky7Array.length; i++ ) {
			if (Lucky7Array[i] == 7) {
				Lucky7Array[i] = Lucky7Array[counter];
				Lucky7Array[counter] = 7;
				counter++;
				
			}
		
		}
	}
}