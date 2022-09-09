//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{ 
	}

	public void setPlayers(String player)
	{ 
		setPlayers(player);
		 player = "";
		String compChoice = "";
		
		if (player == "R" || player == "P" || player == "S") {
			playChoice = player;
		int num = (int)Math.random() *3;
		if (num == 1)  compChoice = "R";
        if (num == 2) compChoice = "P";
		if (num == 3) compChoice = "S";
		}
		
		}
	
	

	public String determineWinner()
	{   String winner = "";
		String draw = "You both picked the same option! It's a draw!";
		if (playChoice == compChoice) {
			return draw;
		}
		if (playChoice == "R" && compChoice == "S") winner = "You win <<Rock Breaks Scissors>>! Play again!";
		if (playChoice == "S" && compChoice == "R") winner = "You Lost <<Rock Breaks Scissors>>! Play again!";
		if (playChoice == "P" && compChoice == "S") winner = "You Lost <<Scissors Cuts Paper>>! Play again!";
		if (playChoice == "S" && compChoice == "P") winner = "You win <<Scissors Cuts Paper>>! Play again!";
		if (playChoice == "R" && compChoice == "P") winner = "You Lost <<Paper Covers Rock>>! Play again!";
		if (playChoice == "P" && compChoice == "R") winner = "You win <<Paper Covers Rock>>! Play again!";
		return winner;
		}
		
	

	public String toString()
	{
		String output= determineWinner();
		return output;
	}
}