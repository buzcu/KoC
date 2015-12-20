package koc;

public class Hunter extends Hero {
	int range;

	public Hunter() {
		// TODO Auto-generated constructor stub
	}

	public Hunter(String name, int health, int armor, int attackDamage, int attackSpeed, int level, int experience,
			int goldCoin) {
		super(name, health, armor, attackDamage, attackSpeed, level, experience, goldCoin);
		// TODO Auto-generated constructor stub
	}

	public Hunter(int AllianceRep) {
		super(AllianceRep);
		// TODO Auto-generated constructor stub
	}

	
	public Hunter(int range, int AllianceRep) {
		super(AllianceRep);
		this.range = range;
		
	}
	
	public void setRange(int range){
		this.range = range;
	}
	public int getRange(){
		return range;
	}
	
	@Override
	public void increaseRep() {
		// TODO Auto-generated method stub

	}
	
	public void hitPos(int range){
		//Implementation will be added
	}

	@Override
	public void decrease() {
		// TODO Auto-generated method stub

	}

}
