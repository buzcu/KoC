package koc;

public class Mage extends Hero {
	int mana;

	public Mage() {
		// TODO Auto-generated constructor stub
	}

	public Mage(String name, int health, int armor, int attackDamage, int attackSpeed, int level, int experience,
			int goldCoin) {
		super(name, health, armor, attackDamage, attackSpeed, level, experience, goldCoin);
		// TODO Auto-generated constructor stub
	}

	
	public Mage(int mana) {
		this.mana= mana;
	}
	public void setMana(int mana){
		this.mana = mana;
	}
	public int getMana(){
		return mana;
	}
	
	public void increaseRep(){
		//Implementation will be added
	}
	public void decrease(){
		//Implementation will be added
	}
	
	public void magicAttack(int mana){
		//Implementation will be added
	}
	
	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}
