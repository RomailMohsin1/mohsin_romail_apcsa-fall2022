//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;
    private int len;
	public Word( String s )
	{
		word = s;
		len = word.length();
	}
	public int getLen() {
		return len;
	}
	public String getWord() {
		return word;
	}

	public int compareTo( Word rhs )
	{	if (len != rhs.getLen()) {
		return len - rhs.getLen();
	}
	 for (int i = 0; i < len; i++) {
		 if (word.charAt(i) != rhs.getWord().charAt(i)) {
			 return (word.charAt(i) - rhs.getWord().charAt(i));
		 }
	 }
		return 0;
	}

	public String toString()
	{
		return word;
	}
}