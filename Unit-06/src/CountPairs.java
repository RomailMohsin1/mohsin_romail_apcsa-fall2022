//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
		//out.println(i);
		char letterA = str.charAt(i);
		char letterB = str.charAt(i+1);
		if (letterA == letterB) {
			count++;
		}
		}
		return count;
	}
}