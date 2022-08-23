//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		//double x3 = (x2-x1);
		//double x4 = x3 * x3;
		//double y3 = (y2-y1);
		//double y4 = (y3 * y3);
		//double dist = y4 + x4;
		//double distance1 = Math.sqrt(dist);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
		
	}

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow(xTwo-xOne, 2)+ Math.pow(yTwo - yOne, 2));
		
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
		System.out.print(distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}