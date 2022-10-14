//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter the 1st Monster's name :");
		String name1 = keyboard.next();
		System.out.println("Enter the 1st Monster's size");
		int size1 = keyboard.nextInt();
		
		//instantiate monster one
		Skeleton Monster1 = new Skeleton(name1, size1);
		
		//ask for name and size
		System.out.println("Enter the 2nd Monster's name :");
		String name2 = keyboard.next();
		System.out.println("Enter the 2nd Monster's size :");
		int size2 = keyboard.nextInt();
		
		//instantiate monster two
		Skeleton Monster2 = new Skeleton(name2,size2);
		System.out.println(Monster1.isBigger(Monster2));
	}
}