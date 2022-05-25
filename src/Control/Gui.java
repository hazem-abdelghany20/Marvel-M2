package Control;

import engine.*;
import model.world.Champion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import View.*;

public class Gui extends JFrame {
	private Player pl1;
	private Player pl2;
	private Game game;
	private PlayersWindow pw;
	private StartingWindow sw;
	private Window w;
	private ChampionsWindow cw;
	private JButton Play;
	
	private JButton Enter; 
	private JTextField Pl1,Pl2;
	private Player Player1;
	private Player Player2;
	
	public Gui() {
		sw = new StartingWindow();
		pw = new PlayersWindow();
		w= new Window();
		cw= new ChampionsWindow();
		
		
			Play = new JButton("Play");
			Play.setBounds(350, 500, 100, 60);
			Play.setForeground(Color.white);
	    	Play.setBackground(Color.red);
	    
	    	sw.add(Play);
			Play.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sw.setVisible(false);
					pw.setVisible(true); }});
			
		sw.revalidate();
		sw.repaint();
		
		Enter= new JButton ("Enter");
		Enter.setBounds(310,480,100,100); 
		Pl1= new JTextField ("name");
		Pl1.setBounds(100,350,100,30);
		Pl2= new JTextField ("name");
		Pl2.setBounds(550,350,100,30);
		
		pw.add(Enter);pw.add(Pl1);pw.add(Pl2);
		pw.revalidate();
		pw.repaint();
		
		Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pl1.getText()==null||Pl2.getText()==null) {return;
				}else {
				String P1name = Pl1.getText();
				String P2name = Pl2.getText();
				Player1 = new Player(P1name);
				Player2 = new Player(P2name);
				pw.setVisible(false);
				cw.setVisible(true);;} }});
		
		
		cw.revalidate();
		cw.repaint();
		//game.loadChampions(Champions.csv);
		for(Champion c: game.getAvailableChampions() ) {
			
			JButton b= new JButton ();
			b.setText(getName());
			cw.getChamps().add(b);
		}
		
		
	}
	public static void main (String [] args) {
		new Gui();
	}
	
	
	
}