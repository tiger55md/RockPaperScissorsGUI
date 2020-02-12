package RockPaperScissors;

import java.util.Random;

public class Computer {
	
	private String name;

	public Computer(String name) {
		this.name = name;
	}
	
	public int input() {
		Random rand = new Random();
		return (rand.nextInt(3)+1);
	}
	
	public String getName() {
		return name;
	}

}
