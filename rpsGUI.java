package RockPaperScissors;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class rpsGUI extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private int playH;
	private Graphics G;
	private Game rps = new Game(5);
	private Computer Manel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rpsGUI frame = new rpsGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public rpsGUI() {
		Manel = new Computer("Manel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setName("RPS");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 3, 0, 0));
		
		JRadioButton rdbtnRock = new JRadioButton("rock");
		buttonGroup.add(rdbtnRock);
		contentPane.add(rdbtnRock);
		
		JRadioButton rdbtnPaper = new JRadioButton("paper");
		buttonGroup.add(rdbtnPaper);
		contentPane.add(rdbtnPaper);
		
		JRadioButton rdbtnScissors = new JRadioButton("scissors");
		buttonGroup.add(rdbtnScissors);
		contentPane.add(rdbtnScissors);
		
		JButton btnPlayNow = new JButton("Play Now!");
		btnPlayNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int playC = Manel.input();
				if(rdbtnRock.isSelected()) {
					playH = 1;
					System.out.println("You choose rock");
					rps.comparison(playH, playC);
					
				}
				else if(rdbtnPaper.isSelected()) {
					playH = 2;
					System.out.println("You choose Paper");
					rps.comparison(playH, playC);
				}
				else if(rdbtnScissors.isSelected()) {
					playH = 3;
					System.out.println("You choose Scissors");
					rps.comparison(playH, playC);
				}
			}
		});
		btnPlayNow.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(btnPlayNow);
		
		if(rps.done()) {
			rps.winner();
		}
	}
	
	
}
