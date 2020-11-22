package ui;
import javax.swing.*;
import java.awt.event.*;
import services.*;
import java.awt.Color;
import repositories.UserRepository;

public class AdminLogin {
 
    AdminLogin()
	 {
    JFrame f=new JFrame();  
    JTextField f1=new JTextField();  
    f1.setBounds(100,50,150,30);
	JLabel l1,l2;  
    l1=new JLabel("User Name:");  
    l1.setBounds(20,50, 100,30);  
	
	l2=new JLabel("Password:");    
    l2.setBounds(20,100, 80,30);  
            
   JPasswordField value = new JPasswordField();
   value.setBounds(100,100,150,30); 
   
    JButton b=new JButton("Login");  
    b.setBounds(125,140,95,30);  
	
		
    b.addActionListener(new ActionListener()
 {
        public void actionPerformed(ActionEvent e)
        {
             UserRepository Obj=new UserRepository();
 
                String pwd=new String(value.getPassword());
               
                System.out.println("Username,Pwd:"+f1.getText()+","+pwd);
               			   
                if(Obj.checkLogin(f1.getText(), pwd))
                {
                     new UserHome();
                }
                else
                {
                    //a pop-up box
                    JOptionPane.showMessageDialog(null, "Login failed!","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }
 }
		);
	
	f.getContentPane().setBackground(Color.GRAY);
	f.add(f1); 
	f.add(b);
	f.add(l1);
	f.add(l2); 
	f.add(value); 
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);
	
}   
} 
