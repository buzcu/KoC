package koc;

import java.util.Random;

public class Hunter extends Hero {
	int range;
	Boolean isHit = false;

	public Hunter() {
		// TODO Auto-generated constructor stub
	}

	public Hunter(String name) {
		super(name, 10, 1, 1, 1, 1, 0, 0);
		// TODO Auto-generated constructor stub
	}

	public Hunter(int AllianceRep) {
		super(AllianceRep);
		// TODO Auto-generated constructor stub
	}
	
	public void setName(String name){
		this.name = new String(name);
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
		if(range>100){
			System.out.println(range+"is Out of Range");
		}

		else{
			
			double random = Math.random() * 50 + 1;
			if (random<25){
				System.out.println("You Missed!");
			}
			else{
				System.out.println("You hit the Enemy!");
				isHit = true;
			}
	
		}
		
	}

	@Override
	public void decrease() {
		// TODO Auto-generated method stub

	}

}
