//Sazzad Hossain
package com.mypackages;

import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public  class login 
{
	public login()
	{
	 //a separate class for processing database connection and authentication
   
    //declaring our swing components
	JFrame c=new JFrame("Login");
    JLabel l_name=new JLabel("Username");
	JLabel l_pass=new JLabel("Password");
    
      JTextField t_name=new JTextField(10);
      JPasswordField t_pass=new JPasswordField(10);
      JButton button=new JButton("Login");
	   JButton button2=new JButton("New User");
	
 button.addActionListener(new ActionListener()
 {
        public void actionPerformed(ActionEvent e)
        {
             databaseClass mydbObj=new databaseClass();
 
                String pwd=new String(t_pass.getPassword());
               
                System.out.println("Username,Pwd:"+t_name.getText()+","+pwd);
                //The entered username and password are sent via "checkLogin()" which return boolean
                if(mydbObj.checkLogin(t_name.getText(), pwd))
                {
                     new profile();
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
		
		button2.addActionListener(new ActionListener()
		{
        public void actionPerformed(ActionEvent e)
        {
            new registration(); 
        }
		}
		);
		
		
	c.getContentPane().setBackground(Color.CYAN);
       	c.add(l_name);
        c.add(t_name);
        c.add(l_pass);
        c.add(t_pass);
        c.add(button);
		c.add(button2);
        c.setLayout(new FlowLayout());
        c.setVisible(true);
        c.setSize(400,260);   
	}		
}//class
