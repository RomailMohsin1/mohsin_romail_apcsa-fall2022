//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		
	}

	public void setNums(int dist, int hrs, int mins)
	{
		hours = hrs;
		distance = dist;
		minutes = mins;
	}

	public void calcMPH()
	{
		
		mph = (distance / (minutes /60 + hours));
	}

	public void print()
	{
		out.print(mph);
		
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}