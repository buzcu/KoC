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
			System.out.println("You can (R)est or (W)alk:");
			
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

			player.health = (int) (player.health * 1.1);
			if (player.health>player.maxHealth)
			{
				player.health=player.maxHealth;
			}
			int luck = rand.nextInt(100)+1;
			
			if (luck < 15)
			{
				new Fight(player, new Orc());
			}
			else if (luck < 40)
			{
				new Fight(player, new DeathEater());
				
			}
			else if (luck < 55)
			{
				new Fight(player, new Nazi());
				
			}
			else if (luck < 75)
			{
				new Fight(player, new StormTrooper());
				
			}
			else if (luck < 90)
			{
				new Fight(player, new Assasin());
				
			}
			else
			{
				System.out.println("You were lucky and saw no monsters.");
			}
			
		}
		//Rest Functionality rests here
		if(playerMove.equals("R") || playerMove.equals("r"))
		{
			player.health = player.health + (int)(player.health * 1.4) + 1;
			if (player.health>player.maxHealth){
				player.health=player.maxHealth;
				}
			
		}
		System.out.println("Your new health is: "+ player.health);
		
	}


	public void gameOver(){
		System.out.println("Oh No! You have been slayed by enemy! Your journey is over. Better luck next time. \n(Game Over)");
		
		
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
			GameCycle newgame = new GameCycle();
			newgame.loopUntilGameOver();
			newgame.gameOver();
		}
		
		
	}
	
	public void loopUntilGameOver() {
		while (player.health > 0)
		{
			move();
			if (player.goldCoin>=100){
				System.out.println("Yay! You gathered the required gold to pay Zomorok. Now your sister should be free! \n\nWait what!?!!\nZomorok refuses to release your sister and he demands a fight! A wild Zomorok appeared!");
				System.out.println("\n----\tBoss Fight!\t---\n");
				Character zomorok = new Orc();
				zomorok.maxHealth=30;
				zomorok.health=30;
				zomorok.level=5;
				zomorok.attackDamage=4;
				Fight finall = new Fight(player, zomorok);
				if (finall.Result){
					System.out.println("You finally killed Zomorok and rescued your sister! Well done!");
					break;
				}
				else {
					System.out.println("Noooooooooooooo...... Zomorok was your father!\nAnd you are dead...");
				}
			}
		}

	}

}
