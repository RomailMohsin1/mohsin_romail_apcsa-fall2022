//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		int len = word.length();
		for (int i = len; i > 0; i--) {
			System.out.println(word.substring(0,i));
		}
	}
}