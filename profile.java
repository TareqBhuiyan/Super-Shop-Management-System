package com.mypackages;

import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
 public class profile{
	 
	 profile()
	 {
    JFrame f=new JFrame("");
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	
	
    l1=new JLabel("Name:");  
    l1.setBounds(20,100, 100,30); 
	
	l2=new JLabel("EmailId:");    
    l2.setBounds(20,150, 100,30);
	
	l3=new JLabel("Adress:");  
    l3.setBounds(20,200, 100,30); 

    l4=new JLabel("Date of Birth:");    
    l4.setBounds(20,250, 100,30); 	
	
	l5=new JLabel("Gender:");  
    l5.setBounds(20,300, 100,30); 

	l6=new JLabel("profession");  	
    l6.setBounds(20,350, 100,30); 
	
	l7=new JLabel("interesrs");  
    l7.setBounds(20,400, 100,30);  
   
 
	
	
    JTextField f1=new JTextField();  
    f1.setBounds(150,100,150,30);	
	
	JTextField f2=new JTextField();  
    f2.setBounds(150,150,150,30);
     
	JTextField f3=new JTextField();  
    f3.setBounds(150,200,150,30);
	
	 JTextField f4=new JTextField();  
    f4.setBounds(150,250,150,30);
	 
	JTextField f5=new JTextField();  
    f5.setBounds(150,300,150,30);		 
	
	JTextField f6=new JTextField();  
    f6.setBounds(150,350,150,30);
	
	

    
	JRadioButton r1=new JRadioButton("A) Male"); 
    r1.setBounds(150,450,150,30);
	
    JRadioButton r2=new JRadioButton("B) Female");    
    r2.setBounds(150,500,150,30);
	
	ButtonGroup bg=new ButtonGroup();  
	
	
			 
	bg.add(r1);
	bg.add(r2);
	
	
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	f.add(l5);
	f.add(l6);
	f.add(l7);
	f.add(f1);
	f.add(f2);
	f.add(f3);
	f.add(f4);
	f.add(f5);
	f.add(f6);
	f.add(r1);
	f.add(r2); 
	f.setSize(500,800);  
    f.setLayout(null);  
    f.setVisible(true);    
    	 
	 
 }
 }
 