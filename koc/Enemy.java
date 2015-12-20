package koc;

public abstract class  Enemy extends Character {

	int EnemyRep;
	
	public Enemy() {
		// TODO Auto-generated constructor stub
	}
	
	public Enemy(Hero player)
	{
		this.getExperience(player.experience);
		
	}

	public Enemy(String name, int health, int armor, int attackDamage, int attackSpeed, int level, int experience,
			int goldCoin) {
		super(name, health, armor, attackDamage, attackSpeed, level, experience, goldCoin);
		// TODO Auto-generated constructor stub
	}

	public Enemy(int EnemyRep) {
		this.EnemyRep = EnemyRep;
		
	}

	public void setEnemyRep(int EnemyRep){
		this.EnemyRep = EnemyRep;
	}
	public int getEnemyRep(){
		return EnemyRep;
	}
	
	public abstract void increaseRep();
	public abstract void decrease();
	
	
	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}
