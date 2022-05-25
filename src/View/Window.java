package View;

	import java.awt.event.*;  
	import java.awt.*;  
	import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
	public class Window extends JFrame implements ActionListener{  
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,
	Up,Down,Left,Right;
	Icon star;  
	Icon ic6=new ImageIcon(this.getClass().getResource("/image/hawk.jpg"));  
	Icon ic11=new ImageIcon(this.getClass().getResource("/image/flash.jpg"));  
	Icon ic12=new ImageIcon(this.getClass().getResource("/image/ironman.jpg"));  
	Icon ic16=new ImageIcon(this.getClass().getResource("/image/bat.jpg"));  
	Icon ic17=new ImageIcon(this.getClass().getResource("/image/hulk.jpg"));  
	Icon ic21=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic22=new ImageIcon(this.getClass().getResource("/image/thor.jpg"));  
	Icon ic27=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic9=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	  
	Icon ic1=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic2=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic13=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic14=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic15=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic3=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic4=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic18=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic19=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	  
	Icon ic5=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic7=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic23=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic24=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic25=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic26=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic8=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic28=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	Icon ic29=new ImageIcon(this.getClass().getResource("/image/blank.jpg"));  
	  
	Window(){  
	  
	super("pic puzzle");  
	  
	b1=new JButton(ic1);  
	b1.setBounds(10,80,100,100);  
	b2=new JButton(ic2);  
	b2.setBounds(110,80,100,100);  
	b3=new JButton(ic3);  
	b3.setBounds(210,80,100,100);  
	b4=new JButton(ic4);  
	b4.setBounds(310,80,100,100);  
	b5=new JButton(ic5);  
	b5.setBounds(410,80,100,100);  
	
	b6=new JButton(ic6);  
	b6.setBounds(10,180,100,100);  
	b7=new JButton(ic7);  
	b7.setBounds(110,180,100,100);  
	b8=new JButton(ic8);  
	b8.setBounds(210,180,100,100);  
	b9=new JButton(ic9);  
	b9.setBounds(310,180,100,100);   
	b10=new JButton(ic11);  
	b10.setBounds(410,180,100,100);
	
	b11=new JButton(ic12);  
	b11.setBounds(10,280,100,100); 
	b12=new JButton(ic13);  
	b12.setBounds(110,280,100,100); 
	b13=new JButton(ic14);  
	b13.setBounds(210,280,100,100); 
	b14=new JButton(ic15);  
	b14.setBounds(310,280,100,100); 
	b15=new JButton(ic16);  
	b15.setBounds(410,280,100,100); 
	
	b16=new JButton(ic17);  
	b16.setBounds(10,380,100,100); 
	b17=new JButton(ic18);  
	b17.setBounds(110,380,100,100); 
	b18=new JButton(ic19);  
	b18.setBounds(210,380,100,100); 
	b19=new JButton(ic21);  
	b19.setBounds(310,380,100,100); 
	b20=new JButton(ic22);  
	b20.setBounds(410,380,100,100); 
	
	b21=new JButton(ic23);  
	b21.setBounds(10,480,100,100); 
	b22=new JButton(ic24);  
	b22.setBounds(110,480,100,100); 
	b23=new JButton(ic25);  
	b23.setBounds(210,480,100,100); 
	b24=new JButton(ic26);  
	b24.setBounds(310,480,100,100); 
	b25=new JButton(ic27);  
	b25.setBounds(410,480,100,100); 
	JButton Up = new JButton("+");
    Up.setBounds(600, 630, 30, 25);
    Up.setBorder(new RoundedBorder(10)); //10 is the radius
    Up.setForeground(Color.gray);
    
    JButton Down = new JButton("-");
    Down.setBounds(600, 570, 30, 25);
    Down.setBorder(new RoundedBorder(10)); //10 is the radius
    Down.setForeground(Color.gray);
    
    JButton Left = new JButton(">");
    Left.setBounds(630, 600, 30, 25);
    Left.setBorder(new RoundedBorder(10)); //10 is the radius
    Left.setForeground(Color.gray);
    
    JButton Right = new JButton("<");
    Right.setBounds(570, 600, 30, 25);
    Right.setBorder(new RoundedBorder(10)); //10 is the radius
    Right.setForeground(Color.gray);

	
	  
	add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
	add(b10);add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);add(b17);
	add(b18);add(b19);add(b20);add(b21);add(b22);add(b23);add(b24);add(b25);
	add(Up);add(Down);add(Left);add(Right); Up.addActionListener(this);
	Down.addActionListener(this);Left.addActionListener(this);Right.addActionListener(this);
	setLayout(null);  
	setSize(800,800);  
	setVisible(true);  
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}  
	  
	public void actionPerformed(ActionEvent e){  
		if(star== null&&e.getSource()==b1)
		star=b1.getIcon();
		
		if(e.getSource()==Up)
			//to be continued
		
	if(e.getSource()==b1){  
	    Icon s1=b1.getIcon();  
	      if(b2.getIcon()==star){  
	        b2.setIcon(s1);  
	        b1.setIcon(star); 
	        star=null;
	      } else if(b4.getIcon()==star){  
	                    b4.setIcon(s1);  
	                    b1.setIcon(star); 
	                    star=null;
	                   }  
	  }//end of if  
	  
	if(e.getSource()==b2){  
	    Icon s1=b2.getIcon();  
	      if(b1.getIcon()==star){  
	        b1.setIcon(s1);  
	        b2.setIcon(star); 
	        star=null;
	      } else if(b5.getIcon()==star){  
	                    b5.setIcon(s1);  
	                    b2.setIcon(star);
	                    star=null;
	                   }  
	         else if(b3.getIcon()==star){  
	                    b3.setIcon(s1);  
	                    b2.setIcon(star);
	                    star=null;
	                   }  
	  }//end of if  
	  
	if(e.getSource()==b3){  
	    Icon s1=b3.getIcon();  
	      if(b2.getIcon()==star){  
	        b2.setIcon(s1);  
	        b3.setIcon(star);
	        star=null;
	      } else if(b6.getIcon()==star){  
	                    b6.setIcon(s1);  
	                    b3.setIcon(star);
	                    star=null;
	                   }  
	  }//end of if  
	  
	if(e.getSource()==b4){  
	    Icon s1=b4.getIcon();  
	      if(b1.getIcon()==star){  
	        b1.setIcon(s1);  
	        b4.setIcon(star);
	        star=null;
	      } else if(b5.getIcon()==star){  
	                    b5.setIcon(s1);  
	                    b4.setIcon(star); 
	                    star=null;
	                   }  
	         else if(b7.getIcon()==star){  
	                    b7.setIcon(s1);  
	                    b4.setIcon(star);
	                    star=null;
	                   }  
	  }//end of if  
	  
	if(e.getSource()==b5){  
	    Icon s1=b5.getIcon();  
	      if(b2.getIcon()==star){  
	        b2.setIcon(s1);  
	        b5.setIcon(star);  
	        star=null;
	      } else if(b4.getIcon()==star){  
	                    b4.setIcon(s1);  
	                    b5.setIcon(star);
	                    star=null;
	                   }  
	         else if(b6.getIcon()==star){  
	                    b6.setIcon(s1);  
	                    b5.setIcon(star); 
	                    star=null;
	                   }  
	          else if(b8.getIcon()==star){  
	                    b8.setIcon(s1);  
	                    b5.setIcon(star);
	                    star=null;
	                   }  
	  }//end of if  
	  
	if(e.getSource()==b6){  
	    Icon s1=b6.getIcon();  
	      if(b3.getIcon()==star){  
	        b3.setIcon(s1);  
	        b6.setIcon(star); 
	        star=null;
	      } else if(b5.getIcon()==star){  
	                    b5.setIcon(s1);  
	                    b6.setIcon(star);
	                    star=null;
	                   }  
	         else if(b9.getIcon()==star){  
	                    b9.setIcon(s1);  
	                    b6.setIcon(star);
	                    star=null;
	                   }  
	}//end of if  
	  
	if(e.getSource()==b7){  
	    Icon s1=b7.getIcon();  
	      if(b4.getIcon()==star){  
	        b4.setIcon(s1);  
	        b7.setIcon(star);
	        star=null;
	      } else if(b8.getIcon()==star){  
	                    b8.setIcon(s1);  
	                    b7.setIcon(star);
	                    star=null;
	                   }  
	 }//end of if  
	  
	   if(e.getSource()==b8){  
	    Icon s1=b8.getIcon();  
	      if(b7.getIcon()==star){  
	        b7.setIcon(s1);  
	        b8.setIcon(star);
	        star=null;
	      } else if(b5.getIcon()==star){  
	                    b5.setIcon(s1);  
	                    b8.setIcon(star);
	                    star=null;
	                   }  
	         else if(b9.getIcon()==star){  
	                    b9.setIcon(s1);  
	                    b8.setIcon(star);
	                    star=null;
	                   }  
	  
	  }//end of if  
	  
	 if(e.getSource()==b9){  
	    Icon s1=b9.getIcon();  
	      if(b8.getIcon()==star){  
	        b8.setIcon(s1);  
	        b9.setIcon(star);
	        star=null;
	      } else if(b6.getIcon()==star){  
	                    b6.setIcon(s1);  
	                    b9.setIcon(star);
	                    star=null;
	                   }  
	  }//end of if  
	
	}//end of actionPerformed  
	  
	public static void main(String args[]){  
	new Window();  
	}//end of main  
	}//end of class