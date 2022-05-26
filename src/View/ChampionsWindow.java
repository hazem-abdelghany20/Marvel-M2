package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class ChampionsWindow extends JFrame {

	 private JLabel select;
	 private JPanel Champs;
	 private JPanel instructions; 
	 private JPanel main;
	 private JTextArea txtCart;
	 
	public ChampionsWindow() {
		
		JLabel select = new JLabel("Player 1, Choose your champions!");
		select.setBounds(100, 100, 200, 100);
		select.setFont(new Font("Serif", Font.BOLD, 30));
		
		setSize(800,800);
		
		main = new JPanel();
		main.setSize(WIDTH, HEIGHT);
		
		instructions = new JPanel();
		instructions.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		instructions.setSize(new Dimension(100,100));
		instructions.add(select);
		main.add(instructions);
		
		Champs = new JPanel();
		Champs.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		Champs.setLayout(new GridLayout(0, 5));
		Champs.setSize(new Dimension(400,400));
		main.add(Champs, BorderLayout.CENTER);
		
		
		txtCart = new JTextArea();
		txtCart.setPreferredSize(new Dimension(200, 200));
		txtCart.setEditable(false);
		txtCart.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		txtCart.setBackground(Color.RED);
		main.add(txtCart, BorderLayout.SOUTH);
		
		add(main);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
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
