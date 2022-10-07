//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
	
	public static void printTriangle(String word)
	{
		int len = word.length();
		String returnStr= "";
		for ( int i = 1; i <= len; i++) {
			String addStr = word.substring(0,i);
			for ( int j = 0; j <i; j++) {
				returnStr += addStr;
			}
			returnStr+="\n";
		}
		System.out.println(returnStr);
	}
}