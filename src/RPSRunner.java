//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
			char cont = 'y';
		
			//out.print("type in your prompt [R,P,S] :: ");
			
			RockPaperScissors game = new RockPaperScissors();
			
			while (cont == 'y') {
		    out.print("type in your prompt [R,P,S] :: ");
		    player = keyboard.next();
		    game.setPlayers(player);
		    System.out.println(game.toString());
		    out.print("Play Again?");
		    cont = keyboard.next().charAt(0);
			}
			
			
		
			
	}
}



