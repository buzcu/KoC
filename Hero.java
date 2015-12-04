package koc;

public abstract class Hero extends Character {
	int  AllianceRep;

	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(String name, int health, int armor, int attackDamage, int attackSpeed, int level, int experience,
			int goldCoin) {
		super(name, health, armor, attackDamage, attackSpeed, level, experience, goldCoin);
		// TODO Auto-generated constructor stub
	}

	
	public Hero(int AllianceRep) {
		this.AllianceRep = AllianceRep;
		
	}
	
	public void setAllianceRepp(int AllianceRep){
		this.AllianceRep = AllianceRep;
	}
	public int getAllianceRep(){
		return AllianceRep;
	}
	
	public abstract void increaseRep();
	public abstract void decrease();
	
	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}
