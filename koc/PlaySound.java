package koc;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Created by master on 14.01.2016.
 */
public class PlaySound {




    public static void playSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/Alican/KoC/koc.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            //ex.printStackTrace();
        }
    }
    public static void stopSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/Alican/KoC/koc.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.stop();

        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            //ex.printStackTrace();
        }
    }
}
