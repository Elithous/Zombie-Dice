package team.Seal;

import java.util.Random;

public class Cup {
	private Dice[] dice = new Dice[13];
	
	Cup() {
		this.fillCup();
	}
	
	public void fillCup() {
		for(int i = 0; i < dice.length; i++) {
			if(i < 6) {
				dice[i] = new Dice("green");
			} else if(i<10) {
				dice[i] = new Dice("yellow");
			} else if(i<13){
				dice[i] = new Dice("red");
			}
		}
	}
	
	public Dice getDice() {
		Random rand = new Random();
		Dice die;
		do {
			die = dice[rand.nextInt(13)];
		} while(die == null);
		return die;
	}
}
