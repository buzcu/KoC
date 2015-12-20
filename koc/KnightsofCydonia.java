package koc;

import java.util.Scanner;

public class KnightsofCydonia {

	private static Scanner reader;

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
			System.out.println("6. Orc:");

			reader = new Scanner(System.in);
			playerType = reader.next();

			if (playerType.equals("1") ||
					playerType.equals("2") ||
					playerType.equals("3") ||
					playerType.equals("4") ||
					playerType.equals("5")||
					playerType.equals("6"))
			{
				System.out.println("You made an incorrect entry!");
			}
			else
			{
				typeValid = 1;
			}
		}

		return playerType;
	}

	public static void main(String[] args) {
		System.out.println("\n/------\t------\t------\\\n*/\\*Knights of Cydonia*/\\*\n/------\t------\t------\\");

		String playerName = getPlayerNameFromUser();
		String playerType = getPlayerTypeFromUser();
		Hero player = getPlayerObject(playerName, playerType);

		GameEnvironment gameEnvironment = new GameEnvironment();


	}

	private static Hero getPlayerObject(String playerName, String playerType) {
		Hero player;
		if (playerType == "1")
		{
			System.out.println("You selected Hunter");
			player = new Hunter();
		}
		else if (playerType == "2")
		{
			System.out.println("You selected Knight");
			player = new Knight();
		}
		else if (playerType == "3")
		{
			System.out.println("You selected Ninja");
			player = new Ninja();
		}
		else if (playerType == "4")
		{
			System.out.println("You selected Warrior");
			player = new Warrior();
		}
		else if (playerType == "5")
		{
			System.out.println("You selected Mage");
			player = new Mage();
		}
		else if (playerType == "6")
		{
			System.out.println("You selected Orc");
			player = new Orc();
		}
		else
		{
			return null;
		}
		return player;
	}

	private static String getPlayerNameFromUser() {

		System.out.println("Please enter your name:");

		reader = new Scanner(System.in);
		String playerName = reader.next();
		System.out.println("Hello "+playerName);

		return playerName;
	}

}