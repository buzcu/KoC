package koc;

public class Ninja extends koc.Hero {
	int energy;

	public Ninja() {
		// TODO Auto-generated constructor stub
	}

	public Ninja(String name, int health, int armor, int attackDamage, int attackSpeed, int level, int experience,
			int goldCoin) {
		super(name, health, armor, attackDamage, attackSpeed, level, experience, goldCoin);
		// TODO Auto-generated constructor stub
	}

	
	public Ninja(int energy) {
		this.energy = energy;	}
	
	public void setEnergy(int energy){
		this.energy = energy;
	}
	public int getEnergy(){
		return energy;
	}
	
	public void increaseRep(){
		//Implementation will be added
	}
	public void decrease(){
		//Implementation will be added
	}
	
	public void critical(int energy){
		//Implementation will be added
	}
	
	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}
