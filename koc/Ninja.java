package koc;

public class Ninja extends Hero {
	int energy;

	public Ninja() {
		// TODO Auto-generated constructor stub
	}

	public Ninja(String name) {
		super(name, 1, 1, 1, 1, 1, 1, 5);
		// TODO Auto-generated constructor stub
	}

	public void setName(String name){
		
		this.name = new String(name);
	}
	public Ninja(int energy) {
		this.energy = energy;	}
	
	public void setEnergy(int energy){
		this.energy = energy;
	}
	public int getEnergy(){
		return energy;
	}
	
	public void increaseRep(){
		//Implementation will be added
	}
	public void decrease(){
		//Implementation will be added
	}
	
	public int critical(int energy){
		//Implementation will be added
		int damage = 0;
		if (energy!=0){
			damage = energy%10;
			energy = energy-10;
			System.out.println("You hit the enemy with"+damage+"damage");
		}
		else{
			System.out.println("Out of Energy!!! Wait 5 seconds to charge!");
			
			for(int i = 0; i< 10; i++) {
			    try {
			        Thread.sleep(5000);
			    } catch(InterruptedException ie) {}
			    System.out.println("Now your energy is full");
			    energy = 1000; 
			    damage = energy%10;
			}
			
		}
		return damage;
	}
	
	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}
