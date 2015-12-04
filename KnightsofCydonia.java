package koc;

import java.util.Scanner;

/**
 * @author gorkem
 *
 */
public class KnightsofCydonia {

	private static Scanner reader;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n/------\t------\t------\\\n*/\\*Knights of Cydonia*/\\*\n/------\t------\t------\\");
		System.out.println("Please enter your name:");
		reader = new Scanner(System.in);
		String s = reader.next();
		System.out.println("Hello "+s);
		
		

	}
	
}