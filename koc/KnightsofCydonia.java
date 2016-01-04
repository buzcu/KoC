package koc;
import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class KnightsofCydonia {

	private static GameCycle game;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n/------\t------\t------\\\n*/\\*Knights of Cydonia*/\\*\n/------\t------\t------\\");
		playSound();
		game = new GameCycle();
		game.loopUntilGameOver();
		game.gameOver();
		stopSound();
		


	}
	public static void playSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/Alican/Desktop/koc.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
	}
	public static void stopSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/Alican/Desktop/koc.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.stop();
            
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
	}

}
