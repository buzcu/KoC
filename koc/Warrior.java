package koc;
import java.util.Random;

public class Warrior extends Hero {
	int buff;

	public Warrior() {
		// TODO Auto-generated constructor stub
	}

	public Warrior(String name) {
		super(name, 1, 1, 1, 1, 1, 1, 5);
		// TODO Auto-generated constructor stub
	}
	
	public Warrior(int buff) {
		this.buff= buff;
	}
	
	public void setBuff(int buff){
		this.buff = buff;
	}
	public int getBuff(){
		return buff;
	}
	
	public void increaseRep(){
		//Implementation will be added
	}
	public void decrease(){
		//Implementation will be added
	}
	
	
	
	public int buffDuration(int buff){
		//Implementation will be added
		
		Random rn = new Random();

		
		    int duration = rn.nextInt(buff) + 1;
		    System.out.println("Your buff is"+buff+"and Buff duration is"+duration);
		return duration;
		
	}
	
	
	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}
