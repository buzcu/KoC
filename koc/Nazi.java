package koc;

public class Nazi extends Enemy {
	int might;

	public Nazi() {
		super("Nazi", 13, 1, 1, 1, 1, 0, 10);
	}

	public Nazi(String name, int health, int armor, int attackDamage, int attackSpeed, int level, int experience,
			int goldCoin) {
		super(name, health, armor, attackDamage, attackSpeed, level, experience, goldCoin);
		// TODO Auto-generated constructor stub
	}

	public Nazi(int EnemyRep) {
		super(EnemyRep);
		// TODO Auto-generated constructor stub
	}

	public Nazi(int might,int EnemyRep) {
		super(EnemyRep);
		this.might = might;
	}

	public void setMight(int might){
		this.might = might;
	}
	public int getMight(){
		return might;
	}
	
	@Override
	public void increaseRep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void decrease() {
		// TODO Auto-generated method stub

	}

}
