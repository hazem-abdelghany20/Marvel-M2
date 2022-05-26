package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class ChampionsWindow extends JFrame {

	 private JLabel select;
	 private JPanel Champs;
	 private JPanel instructions; 
	 private JPanel main;
	 
	public ChampionsWindow() {
		
		JLabel select = new JLabel("Player 1, Choose your champions!");
		select.setBounds(100, 100, 200, 100);
		select.setFont(new Font("Serif", Font.BOLD, 30));
		
		main = new JPanel();
		
		instructions = new JPanel();
		instructions.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		add(instructions, BorderLayout.NORTH);
		//Champs.setBounds(50, 50, 50, 50);
		instructions.setSize(new Dimension(200,200));
		instructions.add(select);
		main.add(instructions);
		
		Champs = new JPanel();
		Champs.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		Champs.setLayout(new GridLayout(0, 5));
		main.add(Champs, BorderLayout.SOUTH);
		//Champs.setBounds(50, 50, 50, 50);
		Champs.setSize(new Dimension(750,500));
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		add(main);
	}

	public JPanel getMain() {
		return main;
	}

	public JPanel getChamps() {
		return Champs;
	}
	public void addd(JPanel p) {
		add(p);
	}
	public void addd(JButton b) {
		Champs.add(b);
	}

	public JPanel getInstructions() {
		return instructions;
	}
}
