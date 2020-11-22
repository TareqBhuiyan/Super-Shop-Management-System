package ui;

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;   
 public class admin{
	 public admin(){
		  {  
    JFrame f=new JFrame();  
    JButton b=new JButton("Admin");  
    b.setBounds(50,50,95,30); 
	JButton b1=new JButton("Customer");  
    b1.setBounds(50,100,95,30); 
	JButton b2=new JButton("Manager");  
    b2.setBounds(50,150,95,30); 
    	
		b.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e){  
          new AdminLogin();
}  
});  
		
		
		b1.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e){  
          new UserLogin();
}  
});  

       b2.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e){  
          new payment();
}  
});  
		
		
    f.add(b); 
	f.add(b1);
	f.add(b2);
    f.setSize(700,600);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  
 }