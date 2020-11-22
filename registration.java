//Sazzad Hossain
package com.mypackages;

import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public  class registration 
{
	public registration()
	{
	JFrame c=new JFrame("Registration");
	
    JLabel l_name=new JLabel("Username");
	JLabel l_pass=new JLabel("Password");
    JLabel l_first=new JLabel("Name");
	JLabel l_email=new JLabel("Email ID");
    JLabel l_dob=new JLabel("Date of Birth");
	JLabel l_add=new JLabel("Address");
	JLabel l_gender=new JLabel("Gernder");
	JLabel l_profession=new JLabel("Profession");
	JLabel l_interest=new JLabel("Interests");
	
      JTextField t_name=new JTextField(20);
      JPasswordField t_pass=new JPasswordField(20);
	  JTextField t_first=new JTextField(20);
	  JTextField t_email=new JTextField(20);
	  JTextArea t_add=new JTextArea(5,20);
	  t_add.setEditable(true);
	  t_add.setLineWrap(true);
	  t_add.setWrapStyleWord(true);
	  JTextField t_dob=new JTextField(20);
	  ButtonGroup genderGroup=new ButtonGroup();  
	JRadioButton m=new JRadioButton("Male",true); 
	m.setActionCommand( "male" );	
	JRadioButton f=new JRadioButton("Female");
	f.setActionCommand( "female" );	
		genderGroup.add(m);
		genderGroup.add(f);
	String professionList[]={"Student","Employee","Business Man"};        
     JComboBox CB_profession=new JComboBox(professionList);    
	CB_profession.setSelectedIndex(0);
	
		 JCheckBox sportsBox = new JCheckBox("Sprots");   
		 JCheckBox techBox = new JCheckBox("Technology");   
		 JCheckBox musicBox = new JCheckBox("Music");   
		 JCheckBox carBox = new JCheckBox("Cars"); 
		 
		 
		
      JButton button=new JButton("Register");

 button.addActionListener(new ActionListener()
 {
        public void actionPerformed(ActionEvent e)
        {
             databaseClass mydbObj=new databaseClass();
			 
			 StringBuffer interests = new StringBuffer();
	if(sportsBox.isSelected()==true)
		{
			interests.append("@"+sportsBox.getActionCommand());
		}
	 if(techBox.isSelected()==true)
		{
			interests.append("@"+techBox.getActionCommand());
		}
		 if(musicBox.isSelected()==true)
		{
			interests.append("@"+musicBox.getActionCommand());
		}
		 if(carBox.isSelected()==true)
		{
			interests.append("@"+carBox.getActionCommand());
		}
	
                String pwd=new String(t_pass.getPassword());
	if (isNullOrEmpty(t_first.getText())||isNullOrEmpty(t_email.getText())||isNullOrEmpty(t_add.getText())||
	 isNullOrEmpty(t_dob.getText())|| isNullOrEmpty(genderGroup.getSelection().getActionCommand())|| 
	 isNullOrEmpty(CB_profession.getSelectedItem().toString())|| isNullOrEmpty(t_name.getText())|| isNullOrEmpty(pwd))
	 { 
	 
	
   JOptionPane.showMessageDialog(null, "Please Enter All Values","OK",JOptionPane.INFORMATION_MESSAGE);
	 }
	else
	{	
	mydbObj.myRegister(t_first.getText(), t_email.getText(), t_add.getText(),t_dob.getText(), genderGroup.getSelection().getActionCommand(), CB_profession.getSelectedItem().toString(),interests.toString(), t_name.getText(), pwd);
	 JOptionPane.showMessageDialog(null, "Registration Successful","OK",JOptionPane.INFORMATION_MESSAGE);
	c.dispose();
	 new profile();
	}

        }
 }		);
		
		c.getContentPane().setBackground(Color.CYAN);
		c.add(l_first);
		c.add(t_first);
		c.add(l_email);
		c.add(t_email);
		c.add(l_dob);
		c.add(t_dob);
		c.add(l_add);
		c.add(t_add);
		c.add(l_gender);
		c.add(m);
		c.add(f);
		c.add(l_profession);
		c.add(CB_profession);
		c.add(l_interest);
		c.add(sportsBox);
		c.add(techBox);
		c.add(musicBox);
		c.add(carBox);
       	c.add(l_name);
        c.add(t_name);
        c.add(l_pass);
        c.add(t_pass);
        c.add(button);
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        c.setVisible(true);
        c.setSize(235,600);   
	}
    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.trim().isEmpty())
            return false;
        return true;
    }	
}//class
