package RockPaperScissors;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainRPS extends Canvas implements ActionListener {
	private Human placa;
	private Computer Toni;
	private Game rock;
	private JFrame frame;
	private int playH;
	
	public MainRPS() {
		Toni = new Computer("Toni");
		placa = new Human();
		rock = new Game(5);
		
		setMaximumSize(new Dimension(1000,1000));
		setMinimumSize(new Dimension(1000,1000));
		setPreferredSize(new Dimension(1000,1000));
		JButton rock1 = new JButton();
		rock1.setVisible(true);
		rock1.setText("Rock");
		rock1.addActionListener(this);
		rock1.setActionCommand("Rock");
		JButton papper1 = new JButton();
		papper1.setVisible(true);
		papper1.setText("Papper");
		papper1.addActionListener(this);
		papper1.setActionCommand("Paper");
		JButton scissors = new JButton();
		scissors.setVisible(true);
		scissors.setText("Scissors");
		scissors.addActionListener(this);
		scissors.setActionCommand("Scissors");
		frame = new JFrame( "RockPaperScissors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setLayout(new FlowLayout());
		frame.add(rock1);
		frame.add(papper1);
		frame.add(scissors);
		frame.setVisible(true);
		frame.add(this, BorderLayout.CENTER);
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.RED);

		
		
		
	}

	public static void main(String[] args) {
		MainRPS jogo = new MainRPS();
		jogo.play();
		

	}
	
	public void play() {
		placa.AskName();
		while(!rock.done()) {
			int playC = Toni.input();
			int playH = placa.getInput();
			if(playH > 0 && playH < 4 ) {
			rock.comparison(playH, playC);
			}
			else {
				System.out.println("Es burro ou fazeste? Joga um numero de 1 a 3");
			}
		}
		rock.winner();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Rock")) {
			playH = 1;
		}
		else if(e.getActionCommand().equals("Paper")) {
			playH = 2;
		}
		else if(e.getActionCommand().equals("Paper")) {
			playH = 3;
		}
		
		
		
	}

}
