package koc;

import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Nazi extends Enemy {
	int might;

	public Nazi() {
		super("Nazi", 13, 1, 1, 1, 1, 0, 0);
	}

	public Nazi(String name, int health, int armor, int attackDamage, int attackSpeed, int level, int experience,
			int goldCoin) {
		super(name, health, armor, attackDamage, attackSpeed, level, experience, goldCoin);
		// TODO Auto-generated constructor stub
	}

	public Nazi(int EnemyRep) {
		super(EnemyRep);
		// TODO Auto-generated constructor stub
	}

	public Nazi(int might,int EnemyRep) {
		super(EnemyRep);
		this.might = might;
	}

	public void setMight(int might){
		this.might = might;
	}
	public int getMight(){
		return might;
	}
	
	@Override
	public void increaseRep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void decrease() {
		// TODO Auto-generated method stub

	}
	
	public void attack_to(Character enemy){
        Random r = new Random();
        double randomValue = r.nextDouble();
        if (randomValue>hitpos)
        {
            System.out.println("Missed! Hitler will be mad!");
            
            playSound();
            
        }
        else {
            enemy.getDamage(this.attackDamage);
        }

    }
    
    public void getDamage(int damage){
        this.health -= damage;
        System.out.println(this.name+" got "+damage+" damage.");
        
        if (this.health <= 0)
        {
        	this.health=0;
            this.die();
        }
        System.out.println(this.name+" got "+this.health+" HP left.");
    }
	
    public void playSound() {
        try {
            AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(new File("/Users/Alican/KoC/hitler.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream2);
            clip.start();
         
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    } 
    public void stopSound() {
        try {
            AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(new File("/Users/Alican/KoC/hitler.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream2);
            clip.stop();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    } 
    
    

    

}
