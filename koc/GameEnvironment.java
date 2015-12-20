
package koc;

import java.util.Scanner;


public abstract class GameEnvironment {
	protected static Scanner reader;
	protected Hero player;
	
	public GameEnvironment()
	{
		reader = new Scanner(System.in);
		String playerName = getPlayerNameFromUser();
		String playerType = getPlayerTypeFromUser();
		player = getPlayerObject(playerName, playerType);
	}


	private static String getPlayerNameFromUser() {

		System.out.println("Please enter your name:");

		String playerName = reader.next();
		System.out.println("Hello "+playerName);

		return playerName;
	}

	private static String getPlayerTypeFromUser()
	{
		String playerType = "-1";
		int typeValid = 0;
		
		while (typeValid == 0)
		{
			System.out.println("Please select your character:");
			System.out.println("1. Hunter:");
			System.out.println("2. Knight:");
			System.out.println("3. Ninja:");
			System.out.println("4. Warrior:");
			System.out.println("5. Mage:");
			
			
			playerType = reader.next();

			if (
					playerType.equals("1") ||
					playerType.equals("2") ||
					playerType.equals("3") ||
					playerType.equals("4") ||
					playerType.equals("5")
				)
			{
				typeValid = 1;
				
			}
			else
			{
				System.out.println("You made an incorrect entry!");
			}
		}
		return playerType;
	}

	private static Hero getPlayerObject(String playerName, String playerType) {
		Hero player;
		if (playerType.equals("1"))
		{
			System.out.println("You selected Hunter");
			player = new Hunter(playerName);
		}
		else if (playerType.equals("2"))
		{
			System.out.println("You selected Knight");
			player = new Knight(playerName);
		}
		else if (playerType.equals("3"))
		{
			System.out.println("You selected Ninja");
			player = new Ninja(playerName);
		}
		else if (playerType.equals("4"))
		{
			System.out.println("You selected Warrior");
			player = new Warrior(playerName);
		}
		else if (playerType.equals("5"))
		{
			System.out.println("You selected Mage");
			player = new Mage(playerName);
		}
		else
		{
			return null;
		}
		return player;
	}



	
}
