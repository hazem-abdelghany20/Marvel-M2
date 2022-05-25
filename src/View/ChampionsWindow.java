package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class ChampionsWindow extends JFrame {

	 JLabel select;
	 JPanel Champs;
	 
	public ChampionsWindow() {
		
		JLabel select = new JLabel("Choose your champions");
		select.setBounds(300, 100, 200, 30);
		
		Champs = new JPanel();
		Champs.setLayout(new GridLayout(0, 3));
		add(Champs, BorderLayout.CENTER);
		
		
		setLayout(null);  
		setBounds(300, 150, 800, 522);
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}

	public JPanel getChamps() {
		return Champs;
	}
}
