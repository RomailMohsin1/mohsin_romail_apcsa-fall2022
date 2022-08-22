//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double x3 = x2-x1;
		double y3 = y2-y1;
		double slope = (y3) / (x3);
		return slope;
	}

}