package ui;
import javax.swing.*;
import java.awt.event.*;
import services.*;

public class UserLogin extends JFrame implements ActionListener{
    JLabel jLabel=new JLabel("== Login Form ==");
    JLabel lUsername=new JLabel("Username");
    JLabel lPassword=new JLabel("Password");
    JButton signupButton=new JButton("Sign Up");
    
    JTextField username=new JTextField();
    JPasswordField password=new JPasswordField();
    JButton login=new JButton("Login");


    public UserLogin(){
        setSize(500,350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Login Form");

        jLabel.setBounds(180, 50, 100, 30);
        add(jLabel);
        lUsername.setBounds(100, 100, 100, 10);
        add(lUsername);
        lPassword.setBounds(100, 150, 100, 10);
        add(lPassword);

       
        username.setBounds(250, 100, 150, 25);
        add(username);
        password.setBounds(250, 150, 150, 25);
        add(password);
        login.setBounds(250, 200, 130, 25);
        add(login);
        signupButton.setBounds(250, 250, 130, 25);
        add(signupButton);
        login.addActionListener(this);
        signupButton.addActionListener(this);

    }
    boolean validation(){ 
        return true;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signupButton){
            UserRegistration ur=new UserRegistration();
            this.dispose();
        }
        else if(e.getSource()==login){
            LoginService ls=new LoginService();
            if(ls.getValidation(username.getText(),password.getText())){
                this.dispose();
                Homepage uh=new Homepage();
            }
            else{
                JOptionPane.showMessageDialog(this,"Inavlid username and password","Invalid",JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
    }
    
}