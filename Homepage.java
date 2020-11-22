package ui;
 
 import javax.swing.*; 
import java.awt.*;
import java.awt.event.*; 
import javax.swing.JFrame;

class Homepage   {    
      
	 JMenu menu1,menu6,sub,sub1,s2,s3,s4,b1,b2,menu7,b3,b4,m1,m2,b5;  
      JMenuItem b6,t2,t3,t4,t5,s5,s6,s7,s8,
	 a1,a2,a3,y1,y2,y3,y4,y5,y6,l1,l2,l3,l4,l5,l6,v1,c1,c2,c3,c4,c5,c6,h1,h2,h3,h4,h5,h6,p1,p2,p3,w1,w2,w3,w4,w5,m3,m4,m5,
	 su1,su2,su3,su4,A1,A2,A3,A4; 
         
     public  Homepage(){  
	 
	       
          JFrame f= new JFrame();
         
        JMenuBar mb=new JMenuBar(); 
		  
        menu1=new JMenu("Collection"); 
		  
        b1=new JMenu("Barbies & Toys"); 

     c1=new JMenuItem("Barbie Doll"); 
	 c2=new JMenuItem("Boy's toy");
     c3=new JMenuItem("Baby Gear");    
     c4=new JMenuItem("Baby Personal Care");
	 c5=new JMenuItem("Baby Clothings Accessories"); 
	 c6=new JMenuItem("Remote Control Toys And Play Vehicles");
	  
	  b1.add(c1);
	  b1.add(c2);
	  b1.add(c3);
	  b1.add(c4);
	  b1.add(c5);
	  b1.add(c6);
	  
		 menu1.add(b1);
		 
       b2=new JMenu("Home & Lifestyle");  
               
	 h1=new JMenuItem("Clook"); 
	 h2=new JMenuItem("Lighting");
     h3=new JMenuItem("Stationery");    
     h4=new JMenuItem("Craft");
	 h5=new JMenuItem("Book"); 
	 h6=new JMenuItem("Furniture");
	  
	  b2.add(h1);
	  b2.add(h2);
	  b2.add(h3);
	  b2.add(h4);
	  b2.add(h5);
	  b2.add(h6);
	  
	  menu1.add(b2);
		  
        b3=new JMenu("Women's Fashion");
		  
		  w1= new JMenuItem("Saree");
		  w2=new JMenuItem("Kamiz");
		  w3=new JMenuItem("jeans &Top's");
		  w4=new JMenuItem("Dress");
		  w5=new JMenuItem("Jewelry collaection");
		  
		  b3.add(w1);
		  b3.add(w2);
		  b3.add(w3);
		  b3.add(w4);
		  b3.add(w5);
		  
		   menu1.add(b3);
		  
		  
          b4=new JMenu("Men's Fashion");  
          m1= new JMenu("Tshirt");
		  
		   su1=new JMenuItem("Polo");
		   m1.add(su1);
		  
		  
		  m2=new JMenu("Pant");
		  
		  su2=new JMenuItem("Chinos");
		  su3=new JMenuItem("Cargo");
		  su4=new JMenuItem("Joggers & Sweatpants");
		   
		   m2.add(su2);
		   m2.add(su3);
		   m2.add(su4);
		    
		  m3=new JMenuItem("Shirt");
		  m4=new JMenuItem("Shoes");
		  m5=new JMenuItem("Panjabi");
		  
		  b4.add(m1);
		  b4.add(m2);
		  b4.add(m3);
		  b4.add(m4);
		  b4.add(m5);
             		  
          b5=new JMenu("Watches & Accessories");
           A1=new JMenuItem("Men's Watch");
		  A2=new JMenuItem("Women's Watch");
		  A3=new JMenuItem("Men's Belt");
		  A4=new JMenuItem("Men's Jewelleries");
		  
		  b5.add(A1);
		  b5.add(A2);
		  b5.add(A3);
		  b5.add(A4);
          b6=new JMenuItem("Sports");
		  
		//  menu2=new JMenu("Track My Order");  
		 
         //  menu3=new JMenu("Customer Care");
		   
		  //f1=new JMenuItem("Call Center");    
         // f2=new JMenuItem("Order");    
          //f3=new JMenuItem("Shipping & Delivery");
         // f4=new JMenuItem("Payment");    
         // f5=new JMenuItem("Returns & Refunds");    
          
		//   menu5=new JMenu("Offer's");
		   
		 menu6=new JMenu("Other Shop's");
		   
		   
		 //  menu8=new  JMenu("Add to card");
	    
          s2=new JMenu("Yellow");    
          
			y1=new JMenuItem("Women");
			y2=new JMenuItem("Men");
			y3=new JMenuItem("Lawn");
			y4=new JMenuItem("Panjabi");
			y5=new JMenuItem("New In");
			y6=new JMenuItem("Ethnic Tops");
			
			s2.add(y1);
			s2.add(y2);
			s2.add(y3);
			s2.add(y4);
			s2.add(y5);
			s2.add(y6);
			 
	   menu6.add(s2);
		    
			s3=new JMenu("La Reve ");
			
			l1=new JMenuItem("Men");
			l2=new JMenuItem("Women");
			l3=new JMenuItem("Salwar Kameez");
			l4=new JMenuItem("Tunic");
			l5=new JMenuItem("Panjabi");
			l6=new JMenuItem("Kameez");
			
			s3.add(l1);
			s3.add(l2);
			s3.add(l3);
			s3.add(l4);
			s3.add(l5);
			s3.add(l6);
			
			menu6.add(s3);
			
          s4=new JMenu("Vogue");
		  
		   v1=new JMenuItem("visite us on Facebook");
		   
		   s4.add(v1);
				  
          s5=new JMenuItem("Top Ten"); 
		  s6=new JMenuItem("Angons");
          s7=new JMenuItem("Sailor");    
          s8=new JMenuItem("Easy");
		   
		 sub=new JMenu("Aarong");
		 
		 a1=new JMenuItem("Shalwar Kameez ");
		 a2=new JMenuItem("Saree");
		 a3=new JMenuItem("Panjabi");
		 
		   
		 sub.add(a1);
		 sub.add(a2);
	     sub.add(a3);
	    
		 
		 sub1= new JMenu("Taaga");
		 t2=new JMenuItem("Taaga men");
		 t3=new JMenuItem("Tunic");
		 t5=new JMenuItem("Price Range Clear");
		 t4=new JMenuItem("Women");
		 
		 
		 
		// JButton b= new JButton("pyment");
		 //b.setBounds(550,50,100,30);
		 
   // b.addActionListener(new ActionListener(){  
   // public void actionPerformed(ActionEvent e){  
        //    new pay();  
    //}  
    //});  
	
		
		 sub.add(a1);
		 sub.add(a2);
		 sub.add(a3);
		
		 sub1.add(t2);
		 sub1.add(t3);
		 sub1.add(t4);
		 sub1.add(t5);
		   
		 sub.add(sub1);
		
          menu6.add(sub);
		 
          menu1.add(b1);
		  menu1.add(b2);
		  menu1.add(b3); 
          menu1.add(b4);
		  menu1.add(b5);
		  menu1.add(b6); 
		  
		  //menu3.add(f1);
		 // menu3.add(f2);
		//  menu3.add(f3); 
        //  menu3.add(f4);
		 // menu3.add(f5);
		  
		  menu6.add(s2);
		  menu6.add(s3); 
          menu6.add(s4);
		  menu6.add(s5);
		  menu6.add(s6);
		  menu6.add(s7);
		  menu6.add(s8); 
		  
          mb.add(menu1);
		  //mb.add(menu2);
		 // mb.add(menu3);
		 
		  //mb.add(menu5);
		  mb.add(menu6);
		  //mb.add(menu8);
		  
		 // f.add(b);
          f.setJMenuBar(mb);  
          f.setSize(500,400);  
          f.setLayout(null);  
          f.setVisible(true); 
             f.getContentPane().setBackground(Color.BLUE);		  
}  


 }
