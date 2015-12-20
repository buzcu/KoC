package koc;

import java.util.Scanner;

/**
 * @author gorkem
 *
 */
public class KnightsofCydonia {

	private static Scanner reader;


	public static void main(String[] args) {
		System.out.println("\n/------\t------\t------\\\n*/\\*Knights of Cydonia*/\\*\n/------\t------\t------\\");
		System.out.println("Please enter your name:");
		reader = new Scanner(System.in);
		String s = reader.next();
		System.out.println("Hello "+s);
		System.out.println(s+" please choose a character:\npress 1 for Knight\n" +
				"press 2 for Ninja\n" +
				"press 3 for Mage\n" +
				"press 4 for Hunter\n" +
				"press 5 for Warrior");
		String choice = reader.next();
		if (choice.equals("1")){
			player = new koc.Knight();
		}
		else if (choice.equals("2")){
			player = new koc.Ninja();
		}

		else if (choice.equals("3")){
			player = new koc.Mage();
		}

		else if (choice.equals("4")){
			player = new koc.Hunter();
		}

		else if (choice.equals("5")){
			player = new koc.Warrior();
		}

		
		

	}
	
}