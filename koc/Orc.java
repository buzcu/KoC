package koc;

public class Orc extends Hero {
	int buff;

	public Orc() {
		// TODO Auto-generated constructor stub
	}

	public Orc(String name, int health, int armor, int attackDamage, int attackSpeed, int level, int experience,
			int goldCoin) {
		super(name, health, armor, attackDamage, attackSpeed, level, experience, goldCoin);
		// TODO Auto-generated constructor stub
	}

	
	public Orc(int buff) {
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
	
	public void buffDuration(int buff){
		//Implementation will be added
	}
	
	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}
