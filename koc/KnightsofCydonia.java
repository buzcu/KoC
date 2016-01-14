package koc;

public class KnightsofCydonia {

	private static GameCycle game;

	/**
	 * @param args
	 */


	public static void main(String[] args) {
		Gui main_gui = new Gui();
		main_gui.main();
		System.out.println("\n/------\t------\t------\\\n*/\\*Knights of Cydonia*/\\*\n/------\t------\t------\\");
		//playSound();
		game = new GameCycle();
		game.loopUntilGameOver();
		game.gameOver();
		//stopSound();
		


	}


}
