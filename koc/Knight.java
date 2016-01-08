package koc;

public class Knight extends Hero {
	int might;

	public Knight() {
		// TODO Auto-generated constructor stub
	}

	public Knight(String name) {
		super(name, 13, 1, 1, 1, 1, 1, 0);
		// TODO Auto-generated constructor stub
	}
	
	public Knight(int might) {
		
		this.might = might;
	}

	public void setName(String name){
		this.name = new String(name);
	}
	
	public void setMight(int might){
		this.might = might;
	}
	public int getMight(){
		return might;
	}
	
	public double attack_Buff(int might){
		
		double random = Math.random() * 10 + 1;
		double damage = might + random;
		System.out.println("Your damage is"+damage+"with"+random+"bonus buff");
		return damage;
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
