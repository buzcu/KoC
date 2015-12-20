package koc;

public class Mage extends Hero {
	int mana;

	public Mage() {
		// TODO Auto-generated constructor stub
	}

	public Mage(String name) {
		super(name, 1, 1, 1, 0, 1, 1, 1);
		// TODO Auto-generated constructor stub
	}

	public void setName(String name){
		this.name = new String(name);
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
	
	public int magicAttack(int mana){
		//Implementation will be added
		int damage = mana*100;
		System.out.println("Your Magic Damage is" +damage);
		mana = mana - 25;
		return damage;
		
	}
	
	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}
