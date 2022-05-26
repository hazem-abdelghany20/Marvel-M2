package View;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class MainWindow extends JFrame {
	JPanel Board;
	
	public JPanel getBoard() {
		return Board;
	}

	public MainWindow() {
		
		Board = new JPanel();
		Board.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		Board.setLayout(new GridLayout(0, 5));
		Board.setSize(new Dimension(400,400));
		
		add(Board);
		setLayout(null);  
		setBounds(300, 150, 800, 522);
		setSize(800,522); 
		  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
}
