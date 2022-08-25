//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;
	private boolean equal;

	public StringEquality()
	{
	}

	public  StringEquality(String one, String two)
	{
		
		//int equality = one.compareTo(two);
	}

	public void setWords(String one, String two)
	{
		
		wordOne = one;
		wordTwo = two;
	}

	public void checkEquality( )
	{
		if(wordOne.equals(wordTwo) == true) {
			equal = true;
			return;
		}
		equal = false;
		return;
	}

	public String toString()
	{
		if (equal == false) {
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
		else { 
			return wordOne + " does  have the same letters as " + wordTwo + "\n";
		}
	}
}