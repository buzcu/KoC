package koc;

public class StormTrooper extends Character {
	int range;

	public StormTrooper() {
		// TODO Auto-generated constructor stub
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

}
