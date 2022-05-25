package Control;

import engine.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import View.*;

public class Gui {
	private Player pl1;
	private Player pl2;
	private Game game;
	private PlayersWindow pw;
	private StartingWindow sw;
	JButton Play;
	
	public Gui() {
		sw = new StartingWindow();
		pw = new PlayersWindow();
			Play = new JButton("Play");
			Play.setBounds(350, 500, 100, 60);
			Play.setForeground(Color.white);
	    	Play.setBackground(Color.red);
	    
	    	sw.addd(Play);
			Play.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sw.setVisible(false);
					pw.setVisible(true); }});
			
		sw.revalidate();
		sw.repaint();
		
	}
	public static void main (String [] args) {
		new Gui();
	}
	
	
	
}