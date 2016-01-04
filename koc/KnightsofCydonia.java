package koc;

public class KnightsofCydonia {

	private static GameCycle game;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n/------\t------\t------\\\n*/\\*Knights of Cydonia*/\\*\n/------\t------\t------\\");
		game = new GameCycle();
		game.loopUntilGameOver();
		game.gameOver();

	}

}
