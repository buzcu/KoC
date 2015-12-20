
package koc;

import java.util.Scanner;


public class SideQuest extends Quest {

	/**
	 * 
	 */
	float sideQuestProbability;
	private static Scanner reader;
	
	public SideQuest(Character player) {
		super();

	}

	public SideQuest(float sideQuestProbability){
		this.sideQuestProbability=sideQuestProbability;

	}


	public static void main(float sideQuestProbability, Character player) {
		System.out.println("[new side quest]: You should go to the devil's castle and save the princess that is held there as a prisoner.");
		System.out.println("A wild toad appeared and coming towards you angrily.\nWhat do you do?\npress j to jump over it\npress a to attack\npress d to defend yourself.");
		Character temp_enemy = new Orc();

		String choice = reader.next();
		if (choice.equals("j")){
			System.out.println("You tried to jump and failed miserably.");
			player.getDamage(100);
		}
		if (choice.equals("d")) {
			System.out.println("You choose to defend yourself and you get to block %50 percent of the damage.");
			player.getDamage(50);
		}
		if (choice.equals("a")){
			System.out.println("You attack first and enemy is damaged");
			temp_enemy.getDamage(50);

		}
	}

}
