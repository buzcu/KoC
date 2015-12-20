/**
 * 
 */
package koc;

public class SideQuest extends Quest {

	/**
	 * 
	 */
	float sideQuestProbability;
	
	public SideQuest() {
		super();

	}

	public SideQuest(float sideQuestProbability){
		this.sideQuestProbability=sideQuestProbability;

	}


	public static void main(float sideQuestProbability) {
		System.out.println("[new side quest]: You should go to the devil's castle and save the princess that is held there as a prisoner.");
		System.out.println("A wild toad appeared and coming towards you angrily.\nWhat do you do?\npress j to jump over it\npress a to attack\npress ");

	}

}
