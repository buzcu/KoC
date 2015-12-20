package koc;

public class Assasin extends Enemy {
	int energy;

	public Assasin() {
		super("Assasin", 10, 1, 1, 1, 1, 0, 10);
	}

	public Assasin(String name, int health, int armor, int attackDamage, int attackSpeed, int level, int experience,
			int goldCoin) {
		super(name, health, armor, attackDamage, attackSpeed, level, experience, goldCoin);
		// TODO Auto-generated constructor stub
	}

	public Assasin(int EnemyRep) {
		super(EnemyRep);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseRep() {
		// TODO Auto-generated method stub

	}
	
	public Assasin(int energy,int EnemyRep) {
		super(EnemyRep);
		this.energy = energy;	
		}
	
	public void setEnergy(int energy){
		this.energy = energy;
	}
	public int getEnergy(){
		return energy;
	}

	@Override
	public void decrease() {
		// TODO Auto-generated method stub

	}
	public void critical(int energy){
		//Implementation will be added
	}

}
