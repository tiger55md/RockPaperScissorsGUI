package RockPaperScissors;

public class Game {
	
	private static final int ROCK = 1;
	private static final int PAPER = 2;
	private static final int SCISSORS = 3;
	
	private int rounds;
	private int pcPoints;
	private int hPoints;
	private int currentRound;

	public Game(int rounds) {
		this.rounds = rounds;
		this.currentRound = 0;
	}
	
	public int rounds() {
		return rounds;
	}
	
	public int currentRound() {
		return currentRound;
	}
	
	public boolean done() {
		return currentRound == rounds();
	}
	
	public void winner() {
		if(pcPoints > hPoints) {
			System.out.println("Pc is winner with " + pcPoints + " pontos");
		}
		else if( hPoints > pcPoints) {
			System.out.println("Human is winner with " + hPoints + " pontos");
		}
		else {
			System.out.println("Issa tie");
		}
	}
	
	public int pcPoints() {
		return pcPoints;
	}
	
	public int hPoints() {
		return hPoints;
	}
	
	
	public void comparison(int playH, int playC) {
		currentRound++;
		if(playH == ROCK) {
			if(playC == PAPER) {
				System.out.println("Human played ROCK and PC Paper. PC gets a point");
				pcPoints++;
			}
			else if(playC == ROCK){
				System.out.println("Issa tie both played rocks");
			}
			else {
				System.out.println("Human played Rock and PC scissors. Human gets a point");
				hPoints++;
				
			}
		}
		else if(playH == PAPER) {
			if(playC == SCISSORS) {
				System.out.println("Human played PAPER and PC Scissors. PC gets a point");
				pcPoints++;
			}
			else if(playC == PAPER) {
				System.out.println("Issa tie both played Paper");
			}
			else {
				System.out.println("Human played Paper and PC played ROCK. Human gets a point");
				hPoints++;
				
			}
		}
		else if(playH == SCISSORS) {
			if(playC == ROCK) {
				System.out.println("Human played Scissors and PC ROck. PC gets a point");
				pcPoints++;
			}
			else if(playC == SCISSORS) {
				System.out.println("Issa tie both played Scissors");
			}
			else {
				System.out.println("Human played Scissors and PC played Paper. Human gets a point");
				hPoints++;
				
			}
			
		}
	}

}
