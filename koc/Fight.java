package koc;

import java.util.Random;
import java.util.Scanner;

public class Fight {
    private static Scanner reader;
    public Boolean Result;
    public Fight(Character player, Character enemy) {
    	reader = new Scanner(System.in);
    	System.out.println("*****************************************************");
        System.out.println("A fight between "+player.name+" and "+enemy.name+" has started!");
        Result=main(player, enemy);

    }

    public Boolean main(Character player, Character enemy){
    	String choice;
    	Random rand = new Random();
    	double attackSpeedTotal = player.attackSpeed + enemy.attackSpeed;
    	attackSpeedTotal *= 100;
        while (player.health>0 && enemy.health>0)
        {
        	if (rand.nextInt((int) attackSpeedTotal) > enemy.attackSpeed*100)
        	{//player's turn
	            System.out.println("\nIt is your turn. Do you want to (H)it or (R)un:");
	            choice = reader.next();
	            if (choice.equals("r"))
	            {//if player chose to run
	            	if (player.attackSpeed >= enemy.attackSpeed)
	            	{//player can run
		                System.out.println("You choose the coward way and you fleed.");
		                return Boolean.FALSE;
	            	}
	            	else
	            	{//player can't run
	            		System.out.println("Your enemy is faster than you. You couldn't run away from him.");
	            	}
	            }
	            else
	            {//player chose to Hit
	            	player.attack_to(enemy);
	            }
        	}
        	else//monster's turn
        	{
                System.out.println("\nIt is your enemy's turn to attack!");
                enemy.attack_to(player);
            }
        }
        if (player.health>0)
        {//player survived
    	   player.collectChest();
           player.getExperience(3);
           System.out.println("Your current health is "+player.health+"/"+player.maxHealth);
           return Boolean.TRUE;
        }
        else
        {//player died
            System.out.println("Oh No! You have been slayed by enemy! Your journey is over. Better luck next time. \n(Game Over)");
            return Boolean.FALSE;
        }
    }

}
