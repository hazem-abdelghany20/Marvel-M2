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
	JPanel pan;
	  
	public StartingWindow(){  
		super("Marvellous");  
		pan = new JPanel();
		
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
	Title.setForeground(Color.white);
	Title.setFont(new Font("serif", Font.BOLD, 50));
	Title.setBounds(200, 100, 500, 200);

	pan.add(Title,BorderLayout.CENTER);
	add(pan);
	pan.setBackground(Color.red);
	setVisible(true);  
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}  
	  
	public void addd(JButton b) {
		add(b);
	}
	public void addd(JButton b,String bl) {
		add(b,bl);
	}
	  
	public static void main(String args[]){  
	new StartingWindow();  
	
	}//end of main  
	
	}//end of class