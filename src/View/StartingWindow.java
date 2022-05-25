package View;


import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import View.* ;

public class StartingWindow  extends JFrame {  
	JButton Play;
	JLabel l1;
	
	  
	public StartingWindow(){  
		super("Marvellous");  
		
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

      
        Icon ic6=new ImageIcon(this.getClass().getResource("/image/background.jpeg"));
        setLayout(new BorderLayout());
        setContentPane(new JLabel(ic6));
        setLayout(new FlowLayout());

        setSize(800,522);
        setBounds(300, 150, 800, 522);
		
		
	JLabel Title = new JLabel("Marvellous Wars");
	Title.setFont(new Font("Serif", Font.BOLD, 50));
	Title.setBounds(200, 100, 500, 200);

	add(Title);
	 
	setVisible(true);  
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}  
	  
	public void addd(JButton j) {
		add(j);
	}
	  
	public static void main(String args[]){  
	new StartingWindow();  
	
	}//end of main  
	
	}//end of class