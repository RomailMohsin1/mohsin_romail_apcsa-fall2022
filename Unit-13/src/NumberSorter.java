//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int divisor = 1;
		while (number /10 != 0) {
			count++;
			divisor *= 10;
				
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		
		int size = getNumDigits(number);
		
		int[] sorted = new int[size];
		for (int c = 0; c < sorted.length; c++) {
			sorted[c] = number % 10;
			number = number/10;
		}
		int min = sorted[0];
		while (number/10 != 0) {
			for (int i = 0; i < sorted.length; i++) {
				if (sorted[i] % 10 < min ) {
					min = sorted[i];
					min++;
					
				}
			}
		}
		return sorted;
	}
}