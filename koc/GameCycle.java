package koc;

import java.util.Random;
import java.util.Scanner;

public class GameCycle extends GameEnvironment {

	
	public GameCycle() {
		super();
	}
	
	
	private void move() {
		String playerMove = "-1";
		int typeValid = 0;
		
		while (typeValid == 0)
		{
			System.out.println("You can (R)est or (W)alk.");
			System.out.println("What is your move?");
			
			playerMove = reader.next();

			if (
					playerMove.equals("r") ||
					playerMove.equals("R") ||
					playerMove.equals("w") ||
					playerMove.equals("W")
				)
			{
				typeValid = 1;
				
			}
			else
			{
				System.out.println("You made an incorrect entry!");
			}
		}
		
		Random rand = new Random();
		
		if (playerMove.equals("W") || playerMove.equals("w"))
		{
			player.health = (int) (player.health * 1.1) + 1;
			int luck = rand.nextInt(100)+1;
			
			if (luck < 15)
			{
				//fight = new Fight(player, new Orc())
			}
			else if (luck < 30)
			{
				
			}
			else if (luck < 45)
			{
				
			}
			else if (luck < 60)
			{
				
			}
			else if (luck < 75)
			{
				
			}
			
		}
		else if(playerMove.equals("R") || playerMove.equals("r"))
		{
			player.health = (int) (player.health * 1.4) + 1;
			
		}
		
	}


	public void gameOver(){
		System.out.println("! GAME OVER !");
		
		
		String playerType = "-1";
		int typeValid = 0;
		
		while (typeValid == 0)
		{
			System.out.println("Want to play again(y/n)?");
			
			playerType = reader.next();

			if (
					playerType.equals("y") ||
					playerType.equals("Y") ||
					playerType.equals("n") ||
					playerType.equals("N")
				)
			{
				typeValid = 1;
				
			}
			else
			{
				System.out.println("You made an incorrect entry!");
			}
		}
		
		if (playerType.equals("y") || playerType.equals("Y"))
		{
			new GameCycle();
		}
		
		
	}
	
	public void loopUntilGameOver() {
		while (player.health > 0)
		{
			

			
			
			move();
		}
		
	}

}
