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

	public void listStats() {
		System.out.println("*****************************************************");
		System.out.println("Name: " + this.name);
		System.out.println("Level: " + this.level);
		System.out.println("Experience: " + this.experience + "/" + ((this.level*this.level)+1));
		System.out.println("Gold: " + this.goldCoin);
		System.out.println("Health: " + this.health + "/" + this.maxHealth);
		System.out.println("Attack Points: " + this.attackDamage);
		System.out.println("Defence Points: " + this.armor);
		System.out.println("Attack Speed: " + this.attackSpeed);
		System.out.println("Hit Chance: " + this.hitpos);
		System.out.println("*****************************************************\n");
		
		
		
	}

}
