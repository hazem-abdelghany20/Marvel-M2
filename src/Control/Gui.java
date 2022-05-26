package Control;

import engine.*;
import model.abilities.Ability;
import model.abilities.AreaOfEffect;
import model.abilities.CrowdControlAbility;
import model.abilities.DamagingAbility;
import model.abilities.HealingAbility;
import model.effects.Disarm;
import model.effects.Dodge;
import model.effects.Effect;
import model.effects.Embrace;
import model.effects.PowerUp;
import model.effects.Root;
import model.effects.Shield;
import model.effects.Shock;
import model.effects.Silence;
import model.effects.SpeedUp;
import model.effects.Stun;
import model.world.AntiHero;
import model.world.Champion;
import model.world.Cover;
import model.world.Hero;
import model.world.Villain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import View.*;

public class Gui extends JFrame implements ActionListener {
	private Player player1;
	private Player player2;
	private Game game;
	private PlayersWindow pw;
	private StartingWindow sw;
	private MainWindow mw;
	private Window w;
	private ChampionsWindow cw;
	private JButton Play;
	
	private JButton Enter; 
	private JTextField Pl1,Pl2;
	private ArrayList <JButton> btns; 
	private ImageIcon bCap; private ImageIcon bDeadpool; private ImageIcon bDrStrange; private ImageIcon bElectro;
	private ImageIcon bGhostRider; private ImageIcon bHela; private ImageIcon bHulk; private ImageIcon bIceman;
	private ImageIcon bIronman; private ImageIcon bLoki; private ImageIcon bQuickSilver; private ImageIcon bSpiderman;
	private ImageIcon bThor; private ImageIcon bVenom; private ImageIcon bYellowJacket;
	
	public Gui() throws IOException {
		sw = new StartingWindow();
		pw = new PlayersWindow();
		cw= new ChampionsWindow();
		mw= new MainWindow();

		
		
		Play = new JButton("Play");
		Play.setSize(100, 60);
		Play.setForeground(Color.white);
	    Play.setBackground(Color.red);
	    
	    sw.add(Play,BorderLayout.CENTER);
	    
	    
	
	
		Game.loadAbilities("Abilities.csv");
		Game.loadChampions("Champions.csv");
		btns = new ArrayList <>();
		
		for (final Champion c : Game.getAvailableChampions() ) {
			JButton btn = new JButton (new ImageIcon(this.getClass().getResource("/image/"+c.getName()+".jpeg")));
			btn.addActionListener(this);
			cw.getChamps().add(btn);
			btns.add(btn);
		}
		/*int i=0;
		while(i<Game.getAvailableChampions().size()) {
			String name = Game.getAvailableChampions().get(i).getName();
			JButton b=null;
			switch(name){
			case"Captain America": b= bCap; break;
			case"Deadpool": b= bDeadpool; break;
			case"Dr Strange":  b= bDrStrange; break;
			case"Electro":  b= bElectro; break;
			case"Ghost Rider":  b= bGhostRider; break;
			case"Hela":  b= bHela; break;
			case"Hulk":  b= bHulk; break;
			case"Iceman": b= bIceman; break;
			case"Ironman": b= bIronman; break;
			case"Loki": b= bLoki; break;
			case"Quicksilver": b= bQuickSilver; break;
			case"Spiderman": b= bSpiderman; break;
			case"Thor": b= bThor; break;
			case"Venom": b= bVenom; break;
			case"Yellow Jacket": b= bYellowJacket; break;
			default: break;
			}
			b.setSize(150,150);
			cw.getChamps().add(b,i);
			i++;
		}*/
		
			Play.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sw.setVisible(false);
					pw.setVisible(true); }});
			
		sw.revalidate();
		sw.repaint();
		
		JButton Enter = new JButton("Enter");
		Enter.setBounds(320, 400, 100, 60);
		Enter.setForeground(Color.white);
		Enter.setBackground(Color.red);
		
		Pl1= new JTextField ("Player 1");
		Pl1.setBounds(100,350,100,30);
		Pl2= new JTextField ("Player 2");
		Pl2.setBounds(550,350,100,30);
		
		pw.add(Enter);pw.add(Pl1);pw.add(Pl2);
		pw.revalidate();
		pw.repaint();
		
		Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pl1.getText()==null||Pl2.getText()==null) {return;}
				else {
				String P1name = Pl1.getText();
				String P2name = Pl2.getText();
				player1 = new Player(P1name);
				player2 = new Player(P2name);
				pw.setVisible(false);
				cw.setVisible(true);;} }});
		
		cw.revalidate();
		cw.repaint();
		
		cw.getChamps().setPreferredSize (new Dimension (750, 500));
		cw.getMain().add(cw.getChamps());
		
		for(int i = 0; i<5 ; i++) {
			for(int j= 0; j<5; j++) {
				JButton btn=null;
				if(game.getBoard()[i][j] instanceof Champion) {
					Champion c = (Champion)game.getBoard()[i][j];
					btn.setIcon(new ImageIcon(this.getClass().getResource("/image/"+c.getName()+".jpeg")));
					btn.addActionListener(this);
				}
				if(game.getBoard()[i][j] instanceof Cover) {
					btn.setText("Cover");
				}
				
				mw.getBoard().add(btn);
				
			}
		}
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton btn= (JButton) e.getSource();
		if(btns.contains(btn)) {
			
			int btnIndex = btns.indexOf(btn);
			Champion c = game.getAvailableChampions().get(btnIndex);
			
			if(player1.getTeam().size()<3){
				player1.getTeam().add(c);
				btn.setEnabled(false);
			}else {if (player2.getTeam().size()<3) {
				player2.getTeam().add(c);
				btn.setEnabled(false);
				if(player2.getTeam().size()==3) {
				game = new Game(player1, player2);
				cw.setVisible(false);
				mw.setVisible(true);
				}
			}
			}
			
			
		}
	}
	
	public static void main (String [] args) throws IOException {
		new Gui();
	}
	
	
}