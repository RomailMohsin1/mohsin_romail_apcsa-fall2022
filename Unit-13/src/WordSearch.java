//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
        m = new String[size][size];
        for(int i = 0; i < Math.pow(size, 2); i++) {
        	String a = "" + str.charAt(i);
        	m[i/size][i%size] = a;
        }
    }

    public boolean isFound( String word )
    {
    	String firstLetter = "" +word.charAt(0);
    	int count = 0;
    	while (count < Math.pow(m.length,2)) {
    		if (m[count/m.length][count%m.length].equals(firstLetter)) {
    			int i1 = count/m.length;
    			int i2 = count%m.length;
    			boolean right = checkRight(word, i1, i2);
    			boolean left = checkLeft(word, i1, i2);
    			boolean up = checkUp(word, i1, i2);
    			boolean down = checkDown(word, i1, i2);
    			boolean upLeft = checkDiagUpLeft(word, i1, i2);
    			boolean upRight = checkDiagUpLeft(word, i1, i2);
    			boolean downRight = checkDiagDownRight(word, i1, i2);
    			boolean downLeft = checkDiagDownLeft(word, i1, i2);
    			if (right || left || up || down || upLeft || upRight || downRight || downLeft) {
    				return true;
    			}
    		}
    		count++;
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		for (int i = 0; i< w.length(); i++) {
			String let = "" + w.charAt(i);
			if (c + i >= m.length) return false;
			if (!m[r][c+i].equals(let)) return false;
			if (m[r][c+i].equals(let) && i == w.length()-1) return true;
		}
		
		
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		for (int i = 0; i< w.length(); i++) {
			String let = "" + w.charAt(i);
			if (c - i < 0) return false;
			if (!m[r][c-i].equals(let)) return false;
			if (m[r][c-i].equals(let) && i == w.length()-1) return true;
		}
		
		
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		for (int i = 0; i< w.length(); i++) {
			String let = "" + w.charAt(i);
			if (c - i < 0) return false;
			if (!m[r][c-i].equals(let)) return false;
			if (m[r][c-i].equals(let) && i == w.length()-1) return true;
		}
		
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		for (int i = 0; i< w.length(); i++) {
			String let = "" + w.charAt(i);
			if (r - i < 0) return false;
			if (!m[r-i][c].equals(let)) return false;
			if (m[r-i][c].equals(let) && i == w.length()-1) return true;
		}
		
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		for (int i = 0; i< w.length(); i++) {
			String let = "" + w.charAt(i);
			if ((c + i >= m.length) && (c + i >= m.length)) return false;
			if (!m[r][c+1].equals(let) && !m[r][c-i].equals(let)) return false;
			if (m[r][c+i].equals(let) && i == w.length()-1) return true;
		}
		
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		for (int i = 0; i< w.length(); i++) {
			String let = "" + w.charAt(i);
			if ((c + i >= m.length) && (c - i < 0)) return false;
			if (!m[r][c-i].equals(let)) return false;
			if (m[r][c+i].equals(let) && i == w.length()-1) return true;
		}
		
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		for (int i = 0; i< w.length(); i++) {
			String let = "" + w.charAt(i);
			if (c + i >= m.length) return false;
			if (!m[r][c+1].equals(let) && !m[r-i][c].equals(let)) return false;
			if (m[r][c+i].equals(let) && i == w.length()-1) return true;
		}
		
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		for (int i = 0; i< w.length(); i++) {
			String let = "" + w.charAt(i);
			if (c + i >= m.length) return false;
			if (!m[r][c+1].equals(let) && !m[r-i][c].equals(let)) return false;
			if (m[r][c+i].equals(let) && i == w.length()-1) return true;
		}
		
		return false;
	}

    public String toString()
    {
 		return "";
    }
}
