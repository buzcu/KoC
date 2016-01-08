package koc;

import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class StormTrooper extends Enemy {
	int range;

	public StormTrooper() {
		super("StormTrooper", 7, 1, 1, 1, 1, 0, 10);
	}

	public StormTrooper(String name, int health, int armor, int attackDamage, int attackSpeed, int level,
			int experience, int goldCoin) {
		super(name, health, armor, attackDamage, attackSpeed, level, experience, goldCoin);
		// TODO Auto-generated constructor stub
	}

	
	public StormTrooper(int range) {
		this.range = range;
	}
	
	public void setRange(int range){
		this.range = range;
	}
	public int getRange(){
		return range;
	}

	public void increaseRep(){
		//Implementation will be added
	}
	public void decrease(){
		//Implementation will be added
	}
	
	public void hitPos(int range){
		//Implementation will be added
	}
	
	@Override
	public void die() {
		// TODO Auto-generated method stub

	}
	public void attack_to(Character enemy){
        Random r = new Random();
        double randomValue = r.nextDouble();
        if (randomValue>hitpos)
        {
            System.out.println("Missed! Darth Vader will be dissapointed!");
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
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/Alican/KoC/vader.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            //ex.printStackTrace();
        }
    }   


}
