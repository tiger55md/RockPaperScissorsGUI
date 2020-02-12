package RockPaperScissors;

import java.util.Scanner;

public class Human {
	private String name;

	public Human() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void  AskName() {
		System.out.println("Qual seu nome?");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		
	}
	
	public int getInput() {
		System.out.println("Your turn! \n 1- ROCK 2- PAPER 3- SCISSORS");
		Scanner sc = new Scanner(System.in);
		int play = sc.nextInt();
		if(play == 1) {
			System.out.println("YOU CHOOSE ROCK");
		}
		else if(play == 2) {
			System.out.println("YOU CHOOSE PAPER");
		}
		else if(play == 3) {
			System.out.println("YOU CHOOSE SCISSORS");
		}
		return play;
	}

}
