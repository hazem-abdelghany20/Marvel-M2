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
	
	public PlayersWindow(){  
		
		super("pic puzzle");  
	 
		instruction= new JLabel("Please Enter your names:");
		instruction.setBounds(300, 100, 200, 30);
		
		player1= new JLabel("Player 1:");
		player1.setBounds(100, 300, 100, 30);
		
		player2= new JLabel("Player 2:");
		player2.setBounds(550, 300, 100, 30);
		
		Pl1=new JTextField();  
        Pl1.setBounds(100,350,150,20);  
        Pl2=new JTextField();  
        Pl2.setBounds(550,350,150,20);  
		
		
	
		JButton Enter = new JButton("Enter");
		Enter.setBounds(350, 500, 100, 60);
		Enter.setForeground(Color.red);
		Enter.setBackground(Color.BLACK);
    
		add(Enter);add(instruction);add(player1);add(player2)
		;add(Pl1);add(Pl2);
		
		Pl1.addActionListener(this);Pl2.addActionListener(this);
		
		Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pl1.getText()==null||Pl2.getText()==null) {return;
				}else {
				String P1name = Pl1.getText();
				String P2name = Pl2.getText();
				Player1 = new Player(P1name);
				Player2 = new Player(P2name);
				PlayersWindow.this.setVisible(false);
				new Window();}
	     }});
	
	setLayout(null);  
	setSize(800,800); 
	  
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
	  
	public static void main(String args[]){  
	new PlayersWindow();  
	
	}//end of main  
	
	}//end of class