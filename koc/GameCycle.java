package koc;

import java.util.Scanner;

public class GameCycle extends GameEnvironment {

	
	public GameCycle() {
		super();
	}
	
	
	private void move() {
		reader.next();
		
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
			System.out.println("What is your move?");
			move();
		}
		
	}

}
