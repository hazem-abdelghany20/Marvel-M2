package View;


import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import View.* ;
import engine.*;

public class PlayersWindow  extends JFrame implements ActionListener{  
	JButton Enter; 
	JLabel instruction, player1, player2;
	JTextField Pl1,Pl2;
	Icon icPlay=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Player Player1;
	Player Player2;
	
	public JTextField getPl1() {
		return Pl1;
	}


	public JTextField getPl2() {
		return Pl2;
	}



	public PlayersWindow(){  
		
		super("pic puzzle");  
	 
		instruction= new JLabel("Please Enter your names:");
		instruction.setBounds(250, 100, 300, 50);
		instruction.setForeground(Color.white);
		instruction.setFont(new Font("Serif", Font.BOLD, 25));
		
		player1= new JLabel("Player 1:");
		player1.setBounds(100, 300, 100, 50);
		player1.setForeground(Color.white);
		player1.setFont(new Font("Serif", Font.BOLD, 15));
		
		player2= new JLabel("Player 2:");
		player2.setBounds(550, 300, 100, 50);
		player2.setForeground(Color.white);
		player2.setFont(new Font("Serif", Font.BOLD, 15));
		
		
		Icon ic6=new ImageIcon(this.getClass().getResource("/image/background.jpeg"));
		setLayout(new BorderLayout());
		setContentPane(new JLabel(ic6));
	
	add(instruction);add(player1);add(player2);
	
	setLayout(null);  
	setBounds(300, 150, 800, 522);
	setSize(800,522); 
	  
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	
	
	 
	public Player getPlayer1() {
		return Player1;
	}



	public void setPlayer1(Player player1) {
		Player1 = player1;
	}



	public Player getPlayer2() {
		return Player2;
	}



	public void setPlayer2(Player player2) {
		Player2 = player2;
	}



	public void actionPerformed(ActionEvent e){  

		
	}//end of actionPerformed  
	
	public void addd(JButton j) {
		add(j);
	}
	
	public void addd(JTextField j) {
		add(j);
	}
	
	  
	public static void main(String args[]){  
	new PlayersWindow();  
	
	}//end of main  
	
	}//end of class