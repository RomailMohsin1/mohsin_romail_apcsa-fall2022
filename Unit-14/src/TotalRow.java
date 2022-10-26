//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
	
    public static List<Integer> getRowTotals( int[][] m )
    {
    	ArrayList<Integer> funny = new ArrayList<Integer>();
    	int count = 0;
		for (int i = 0; i < m.length; i ++) {
			for ( int c = 0; c < m[i].length; c++) {
				count += m[i][c];
			}
			funny.add(count);
			count= 0;
		}
		return funny;
    }
}
