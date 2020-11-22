package ui;
import javax.swing.*;
import java.awt.event.*;

import services.UserService;
import entities.User;

class UserRegistration extends JFrame implements ActionListener{
    JLabel jLabel=new JLabel("== Registration Form ==");
    JLabel lName=new JLabel("Name");
    JLabel lUsername=new JLabel("Username");
    JLabel lEmail=new JLabel("Email");
    JLabel lPassword=new JLabel("Password");
    JLabel lConfirmPassword=new JLabel("Confirm Password");
    JLabel lDob=new JLabel("Date of Birth");
    JLabel lGender=new JLabel("Gender");

    JTextField name=new JTextField();
    JTextField username=new JTextField();
    JTextField email=new JTextField();
    JPasswordField password=new JPasswordField();
    JPasswordField confirmPassword=new JPasswordField();
    JTextField dob=new JTextField();
    JRadioButton male=new JRadioButton("Male");
    JRadioButton female=new JRadioButton("Female");
    ButtonGroup bg=new ButtonGroup();
    JButton register=new JButton("Submit");


    public UserRegistration(){
        setSize(725,700);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Registration Form");

        jLabel.setBounds(300, 50, 200, 10);
        add(jLabel);
        lName.setBounds(200, 100, 100, 10);
        add(lName);
        lUsername.setBounds(200, 150, 100, 10);
        add(lUsername);
        lEmail.setBounds(200, 200, 100, 10);
        add(lEmail);
        lPassword.setBounds(200, 250, 100, 10);
        add(lPassword);
        lConfirmPassword.setBounds(200, 300, 150, 10);
        add(lConfirmPassword);
        lDob.setBounds(200, 350, 100, 10);
        add(lDob);
        lGender.setBounds(200, 400, 100, 10);
        add(lGender);

        name.setBounds(350, 90, 150, 25);
        add(name);
        username.setBounds(350, 140, 150, 25);
        add(username);
        email.setBounds(350, 190, 150, 25);
        add(email);
        password.setBounds(350, 240, 150, 25);
        add(password);
        confirmPassword.setBounds(350, 290, 150, 25);
        add(confirmPassword);
        dob.setBounds(350, 340, 150, 25);
        add(dob);
        male.setBounds(350, 395, 70, 25);
        add(male);
        female.setBounds(420, 395, 250, 25);
        add(female);
        bg.add(male);
        bg.add(female);
        register.setBounds(280, 450, 150, 25);
        add(register);
        register.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         UserService us=new UserService();
         User user=new User(new String[]{name.getText(),username.getText(),email.getText(),password.getText(),dob.getText(),"Male"});
         if(us.addNewUser(user)){
             JOptionPane.showMessageDialog(this, "User Registered.", "Notification", JOptionPane.INFORMATION_MESSAGE);
             new UserLogin();
             this.dispose();
         }
        
    }
    
}