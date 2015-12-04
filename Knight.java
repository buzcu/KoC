package koc;

public class Knight extends Hero {
	int might;

	public Knight() {
		// TODO Auto-generated constructor stub
	}

	public Knight(String name, int health, int armor, int attackDamage, int attackSpeed, int level, int experience,
			int goldCoin) {
		super(name, health, armor, attackDamage, attackSpeed, level, experience, goldCoin);
		// TODO Auto-generated constructor stub
	}
	
	public Knight(int might) {
		
		this.might = might;
	}

	public void setMight(int might){
		this.might = might;
	}
	public int getMight(){
		return might;
	}
	
	public static void attack_Buff(){
		//Implementation will be added
	}
	
	public void increaseRep(){
		//Implementation will be added
	}
	public void decrease(){
		//Implementation will be added
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}
