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
	private JButton bCap; private JButton bDeadpool; private JButton bDrStrange; private JButton bElectro;
	private JButton bGhostRider; private JButton bHela; private JButton bHulk; private JButton bIceman;
	private JButton bIronman; private JButton bLoki; private JButton bQuickSilver; private JButton bSpiderman;
	private JButton bThor; private JButton bVenom; private JButton bYellowJacket;
	
	public Gui() throws IOException {
		sw = new StartingWindow();
		pw = new PlayersWindow();
		cw= new ChampionsWindow();
		
		
		Play = new JButton("Play");
		Play.setSize(100, 60);
		Play.setForeground(Color.white);
	    Play.setBackground(Color.red);
	    
	    sw.add(Play,BorderLayout.CENTER);
	    
	    bCap= new JButton(new ImageIcon(this.getClass().getResource("/image/captain.jpeg"))); 
	    bDeadpool= new JButton(new ImageIcon(this.getClass().getResource("/image/deadpool.jpeg")));
	    bDrStrange=new JButton(new ImageIcon(this.getClass().getResource("/image/drstrange.jpeg")));
	    bElectro=new JButton(new ImageIcon(this.getClass().getResource("/image/electro.jpeg")));
	    bGhostRider=new JButton(new ImageIcon(this.getClass().getResource("/image/ghostrider.jpeg")));
	    bHela=new JButton(new ImageIcon(this.getClass().getResource("/image/hela.jpeg")));
	    bHulk=new JButton(new ImageIcon(this.getClass().getResource("/image/hulk.jpeg")));
	    bIceman=new JButton(new ImageIcon(this.getClass().getResource("/image/iceman.jpeg")));
	    bIronman=new JButton(new ImageIcon(this.getClass().getResource("/image/ironman.jpeg")));
	    bLoki=new JButton(new ImageIcon(this.getClass().getResource("/image/loki.jpeg")));
	    bQuickSilver=new JButton(new ImageIcon(this.getClass().getResource("/image/quicksilver.jpeg")));
	    bSpiderman=new JButton(new ImageIcon(this.getClass().getResource("/image/spiderman.jpeg")));
	    bThor=new JButton(new ImageIcon(this.getClass().getResource("/image/thor.jpeg")));
	    bVenom=new JButton(new ImageIcon(this.getClass().getResource("/image/venom.jpeg")));
	    bYellowJacket=new JButton(new ImageIcon(this.getClass().getResource("/image/yellowjacket.jpeg")));
	
	
		Game.loadAbilities("Abilities.csv");
		Game.loadChampions("Champions.csv");
		int i=0;
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
		}
		
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
				Player1 = new Player(P1name);
				Player2 = new Player(P2name);
				pw.setVisible(false);
				cw.setVisible(true);;} }});
		
		cw.revalidate();
		cw.repaint();
		
		cw.getChamps().setPreferredSize (new Dimension (750, 500));
		cw.getMain().add(cw.getChamps());
		
		
		bCap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bCap) {
					bCap.setEnabled(false);
				}}
		});
		bDeadpool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bDeadpool) {
					bDeadpool.setEnabled(false);
				}}
		});
		bDrStrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bDrStrange) {
					bDrStrange.setEnabled(false);
				}}
		});
		bElectro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bElectro) {
					bElectro.setEnabled(false);
				}}
		});
		bGhostRider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bGhostRider) {
					bGhostRider.setEnabled(false);
				}}
		});
		bHela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bHela) {
					bHela.setEnabled(false);
				}}
		});
		bHulk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bHulk) {
					bHulk.setEnabled(false);
				}}
		});
		bIceman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bIceman) {
					bIceman.setEnabled(false);
				}}
		});
		bIronman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bIronman) {
					bIronman.setEnabled(false);
				}}
		});
		bLoki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bLoki) {
					bLoki.setEnabled(false);
				}}
		});
		bQuickSilver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bQuickSilver) {
					bQuickSilver.setEnabled(false);
				}}
		});
		bSpiderman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bSpiderman) {
					bSpiderman.setEnabled(false);
					
				}}
		});
		bThor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bThor) {
					bThor.setEnabled(false);
				}}
		});
		bVenom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bVenom) {
					bVenom.setEnabled(false);
				}}
		});
		bYellowJacket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bYellowJacket) {
					bYellowJacket.setEnabled(false);
				}}
		});
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bCap) {
			bCap.setEnabled(false);
		}
		if(e.getSource()==bDeadpool) {
			bDeadpool.setEnabled(false);
		}
		if(e.getSource()==bDrStrange) {
			bDrStrange.setEnabled(false);
		}
		if(e.getSource()==bElectro) {
			bElectro.setEnabled(false);
		}
		if(e.getSource()==bGhostRider) {
			bGhostRider.setEnabled(false);
		}
		if(e.getSource()==bHela) {
			bHela.setEnabled(false);
		}
		if(e.getSource()==bHulk) {
			bHulk.setEnabled(false);
		}
		if(e.getSource()==bIceman) {
			bIceman.setEnabled(false);
		}
		if(e.getSource()==bIronman) {
			bIronman.setEnabled(false);
		}
		if(e.getSource()==bLoki) {
			bLoki.setEnabled(false);
		}
		if(e.getSource()==bQuickSilver) {
			bQuickSilver.setEnabled(false);
		}
		if(e.getSource()==bSpiderman) {
			bSpiderman.setEnabled(false);
		}
		if(e.getSource()==bThor) {
			bThor.setEnabled(false);
		}
		if(e.getSource()==bVenom) {
			bVenom.setEnabled(false);
		}
		if(e.getSource()==bYellowJacket) {
			bYellowJacket.setEnabled(false);
		}
	}
	
	public static void main (String [] args) throws IOException {
		new Gui();
	}
	
	
}