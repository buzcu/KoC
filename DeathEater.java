package koc;

public class DeathEater extends Enemy {
	int mana;
	


	public DeathEater() {
		// TODO Auto-generated constructor stub
	}

	public DeathEater(String name, int health, int armor, int attackDamage, int attackSpeed, int level, int experience,
			int goldCoin) {
		super(name, health, armor, attackDamage, attackSpeed, level, experience, goldCoin);
		// TODO Auto-generated constructor stub
	}

	public DeathEater(int EnemyRep) {
		super(EnemyRep);
		// TODO Auto-generated constructor stub
	}

	public DeathEater(int mana,int EnemyRep) {
		super(EnemyRep);
		this.mana= mana;
	}
	public void setMana(int mana){
		this.mana = mana;
	}
	public int getMana(){
		return mana;
	}
	
	@Override
	public void increaseRep() {
		// TODO Auto-generated method stub

	}

	public void magicAttack(int mana){
		//Implementation will be added
	}
	
	@Override
	public void decrease() {
		// TODO Auto-generated method stub

	}

}
