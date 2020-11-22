package ui;
import javax.swing.*;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import services.UserService;
import entities.User;

public class UserHome extends JFrame implements ActionListener{
    User user =new User();
    UserService us=new UserService();
    List<User> userList=new ArrayList<User>();
    JLabel jLabel=new JLabel("== Dashboard ==");
    JPanel jpAdd=new JPanel();
    JPanel jpEdit=new JPanel();
    JPanel jpDelete=new JPanel();
    JPanel jpSearch=new JPanel();
    JPanel jpAll=new JPanel();
    JButton addUser=new JButton("Add User");
    JButton editUser=new JButton("Edit User");
    JButton deleteUser=new JButton("Delete User");
    JButton searchUser=new JButton("Search User");
    JButton allUser=new JButton("User List");


    JLabel idlJLabel=new JLabel("id");

    JLabel jpAddName=new JLabel("Name");
    JLabel jpAddUsername=new JLabel("Username");
    JLabel jpAddEmail=new JLabel("Email");
    JLabel jpAddPassword=new JLabel("Password");
    JLabel jpAddConfirmPassword=new JLabel("Confirm Password");
    JLabel jpAddDob=new JLabel("Date of Birth");
    JLabel jpAddGender=new JLabel("Gender");

    JTextField idtField=new JTextField();
    JTextField jpaname=new JTextField();
    JTextField jpausername=new JTextField();
    JTextField jpaemail=new JTextField();
    JPasswordField jpapassword=new JPasswordField();
    JPasswordField jpaconfirmPassword=new JPasswordField();
    JTextField jpadob=new JTextField();
    JRadioButton jpamale=new JRadioButton("Male");
    JRadioButton jpafemale=new JRadioButton("Female");
    ButtonGroup bg=new ButtonGroup();
    JButton add=new JButton("Add");
    JButton save=new JButton("Save");
    JButton delete=new JButton("Delete");
    JButton search=new JButton("Search");


    

    public UserHome(){
        setSize(1000,700);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("User | Home");
        

        jpAdd.setBounds(200, 100, 700, 500);
        jpAdd.setBackground(Color.LIGHT_GRAY);
        jpAdd.setLayout(null);
        add(jpAdd);
        jpEdit.setBounds(200, 100, 700, 500);
        jpEdit.setBackground(Color.LIGHT_GRAY);
        jpEdit.setLayout(null);
        add(jpEdit);
        jpDelete.setBounds(200, 100, 700, 500);
        jpDelete.setBackground(Color.LIGHT_GRAY);
        jpDelete.setLayout(null);
        add(jpDelete);
        jpSearch.setBounds(200, 100, 700, 500);
        jpSearch.setBackground(Color.LIGHT_GRAY);
        jpSearch.setLayout(null);
        add(jpSearch);
        jpAll.setBounds(200, 100, 700, 500);
        jpAll.setBackground(Color.LIGHT_GRAY);
        jpAll.setLayout(null);
        add(jpAll);

        jpAdd.setVisible(false);
        jpEdit.setVisible(false);
        jpDelete.setVisible(false);
        jpSearch.setVisible(false);
        jpAll.setVisible(false);

        jLabel.setBounds(450, 50, 200, 25);
        jLabel.setForeground(Color.white);
        jLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
        add(jLabel);
        addUser.setBounds(20, 150, 150, 25);
        add(addUser);
        addUser.addActionListener(this);
        editUser.setBounds(20, 210, 150, 25);
        add(editUser);
        editUser.addActionListener(this);
        deleteUser.setBounds(20, 270, 150, 25);
        add(deleteUser);
        deleteUser.addActionListener(this);
        searchUser.setBounds(20, 330, 150, 25);
        add(searchUser);
        searchUser.addActionListener(this);
        allUser.setBounds(20, 400, 150, 25);
        add(allUser);
        allUser.addActionListener(this);

        

        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==addUser){
            jpAdd.setVisible(true);
            jpEdit.setVisible(false);
            jpDelete.setVisible(false);
            jpSearch.setVisible(false);
            jpAll.setVisible(false);
            clearFields();
            setLabels();
            jpAddName.setBounds(200, 50, 150,25);
            jpAddUsername.setBounds(200, 100, 150,25);
            jpAddEmail.setBounds(200, 150, 150,25);
            jpAddPassword.setBounds(200, 200, 150,25);
            jpAddConfirmPassword.setBounds(200, 250, 150,25);
            jpAddDob.setBounds(200, 300, 150,25);
            jpAddGender.setBounds(200, 350, 150,25);

            jpaname.setBounds(400, 50, 150,25);
            jpausername.setBounds(400, 100, 150,25);
            jpaemail.setBounds(400, 150, 150,25);
            jpapassword.setBounds(400, 200, 150,25);
            jpaconfirmPassword.setBounds(400, 250, 150,25);
            jpadob.setBounds(400, 300, 150,25);
            jpamale.setBounds(400, 350, 60,25);
            jpafemale.setBounds(480, 350, 70,25);
            add.setBounds(400, 400, 150,25);
            bg.add(jpamale);
            bg.add(jpafemale);


            jpAdd.add(jpAddName);
            jpAdd.add(jpAddUsername);
            jpAdd.add(jpAddEmail);
            jpAdd.add(jpAddPassword);
            jpAdd.add(jpAddConfirmPassword);
            jpAdd.add(jpAddDob);
            jpAdd.add(jpAddGender);
            
            jpAdd.add(jpaname);
            jpAdd.add(jpausername);
            jpAdd.add(jpaemail);
            jpAdd.add(jpapassword);
            jpAdd.add(jpaconfirmPassword);
            jpAdd.add(jpadob);
            jpAdd.add(jpamale);
            jpAdd.add(jpafemale);
            jpAdd.add(add);

            add.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){
                        
                        user.setName(jpaname.getText());
                        user.setUsername(jpausername.getText());
                        user.setEmail(jpaemail.getText());
                        user.setPassword(jpapassword.getText());
                        user.setDob(jpadob.getText());
                        if(jpamale.isSelected()==true){
                            user.setGender(jpamale.getText());
                        }
                        else if(jpafemale.isSelected()==true){
                            user.setGender(jpafemale.getText());
                        }
                        else{
                            JOptionPane.showMessageDialog(jpEdit, "Please select gender", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                        if(us.addNewUser(user)){
                            JOptionPane.showMessageDialog(jpEdit, "User Added", "Message", JOptionPane.INFORMATION_MESSAGE);
                            clearFields();    
                        }
                        else{
                            JOptionPane.showMessageDialog(jpEdit, "Error", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        
                }
            });
            
            }
        else if (e.getSource()==editUser){
                jpEdit.setVisible(true);
                jpAdd.setVisible(false);
                jpDelete.setVisible(false);
                jpSearch.setVisible(false);
                jpAll.setVisible(false);
                clearFields();
                setLabels();
                jpAddName.setBounds(200, 50, 250,25);
                jpAddUsername.setBounds(200, 100, 250,25);
                jpAddEmail.setBounds(200, 150, 250,25);
                jpAddPassword.setBounds(200, 200, 250,25);
                jpAddConfirmPassword.setBounds(200, 250, 250,25);
                jpAddDob.setBounds(200, 300, 250,25);
                jpAddGender.setBounds(200, 350, 250,25);

                jpaname.setBounds(400, 50, 150,25);
                jpausername.setBounds(400, 100, 150,25);
                jpaemail.setBounds(400, 150, 150,25);
                jpapassword.setBounds(400, 200, 150,25);
                jpaconfirmPassword.setBounds(400, 250, 150,25);
                jpadob.setBounds(400, 300, 150,25);
                jpamale.setBounds(400, 350, 60,25);
                jpafemale.setBounds(480, 350, 70,25);
                save.setBounds(400, 400, 150,25);
                bg.add(jpamale);
                bg.add(jpafemale);

                jpEdit.add(jpAddName);
                jpEdit.add(jpAddUsername);
                jpEdit.add(jpAddEmail);
                jpEdit.add(jpAddPassword);
                jpEdit.add(jpAddConfirmPassword);
                jpEdit.add(jpAddDob);
                jpEdit.add(jpAddGender);
                
                jpEdit.add(jpaname);
                jpEdit.add(jpausername);
                jpEdit.add(jpaemail);
                jpEdit.add(jpapassword);
                jpEdit.add(jpaconfirmPassword);
                jpEdit.add(jpadob);
                jpEdit.add(jpamale);
                jpEdit.add(jpafemale);
                jpEdit.add(save);

                idlJLabel.setBounds(200, 10, 50,25);
                idtField.setBounds(270, 10, 80,25);
                search.setBounds(400, 10, 150,25);
                
                jpEdit.add(idlJLabel);
                jpEdit.add(idtField);
                jpEdit.add(search);
                search.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent a){
                    
                    user=us.searchUserById(Integer.parseInt(idtField.getText()));
                    setLabels();
                    if(user==null){
                        JOptionPane.showMessageDialog(jpEdit,"User Not Found", "Not Found", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        setLabels();
                        jpaname.setText(user.getName());
                        jpausername.setText(user.getUsername());
                        jpaemail.setText(user.getEmail());
                        jpapassword.setText(user.getPassword());
                        jpaconfirmPassword.setText(user.getPassword());
                        jpadob.setText(user.getDob());
                        if(user.getGender().equals("Male")){
                            jpamale.setSelected(true);
                        }
                        else{jpafemale.setSelected(true);}
                        
                    }
                    
                }
                });


                save.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent a){
                        user.setName(jpaname.getText());
                        user.setUsername(jpausername.getText());
                        user.setEmail(jpaemail.getText());
                        user.setPassword(jpapassword.getText());
                        user.setDob(jpadob.getText());
                        if(jpamale.isSelected()==true){
                            user.setGender(jpamale.getText());
                        }
                        else if(jpafemale.isSelected()==true){
                            user.setGender(jpafemale.getText());
                        }
                        else{
                            JOptionPane.showMessageDialog(jpEdit, "Please select gender", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                        if(us.editUser(user)){
                            JOptionPane.showMessageDialog(jpEdit, "User Information Updated", "Message", JOptionPane.INFORMATION_MESSAGE);    
                            clearFields();
                        }
                        else{
                            JOptionPane.showMessageDialog(jpEdit, "User Information can not be Updated", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    }
                });

            }
        else if (e.getSource()==deleteUser){
            jpDelete.setVisible(true);
            jpAdd.setVisible(false);
            jpEdit.setVisible(false);
            jpSearch.setVisible(false);
            jpAll.setVisible(false);
            clearFields();
            idlJLabel.setBounds(250, 50, 150,25);
            idtField.setBounds(300, 50, 150,25);
            delete.setBounds(300, 100, 150,25);
            
            jpDelete.add(idlJLabel);
            jpDelete.add(idtField);
            jpDelete.add(delete);
            delete.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){
                    int i= JOptionPane.showConfirmDialog(jpDelete, "Are you sure?", "Delete", JOptionPane.YES_NO_CANCEL_OPTION);
                    if(i==0){
                        if(us.deleteUser(Integer.parseInt(idtField.getText()))){
                            JOptionPane.showMessageDialog(jpDelete, "User deleted");
                            clearFields();
                        }
                        else{
                            JOptionPane.showMessageDialog(jpDelete, "Error Occured");
                        }
                        
                    }
                }
            });

        }
        else if (e.getSource()==searchUser){
            jpSearch.setVisible(true);
            jpAdd.setVisible(false);
            jpEdit.setVisible(false);
            jpDelete.setVisible(false);
            jpAll.setVisible(false);
            clearFields();
            jpSearch.add(jpAddName);
            jpSearch.add(jpAddUsername);
            jpSearch.add(jpAddEmail);
            jpSearch.add(jpAddPassword);
            jpSearch.add(jpAddDob);
            jpSearch.add(jpAddGender);

            jpAddName.setBounds(270, 150, 350,25);
            jpAddUsername.setBounds(270, 200, 350,25);
            jpAddEmail.setBounds(270, 250, 350,25);
            jpAddPassword.setBounds(270, 300, 350,25);
            jpAddDob.setBounds(270, 350, 350,25);
            jpAddGender.setBounds(270, 400, 350,25);
            
            idlJLabel.setBounds(250, 50, 150,25);
            idtField.setBounds(300, 50, 150,25);
            search.setBounds(300, 100, 150,25);
            
            jpSearch.add(idlJLabel);
            jpSearch.add(idtField);
            jpSearch.add(search);
            search.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){
                    
                    user=us.searchUserById(Integer.parseInt(idtField.getText()));
                    setLabels();
                    if(user==null){
                        JOptionPane.showMessageDialog(jpEdit,"User Not Found", "Not Found", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        jpAddName.setText(jpAddName.getText()+"                  :     "+user.getName());
                        jpAddUsername.setText(jpAddUsername.getText()+"       :     "+user.getUsername());
                        jpAddEmail.setText(jpAddEmail.getText()+"                :     "+user.getEmail());
                        jpAddPassword.setText(jpAddPassword.getText()+"      :     "+user.getPassword());
                        jpAddDob.setText(jpAddDob.getText()+"        :     "+user.getDob());
                        jpAddGender.setText(jpAddGender.getText()+"          :     "+user.getGender());
                        
                    }
               }
            });
        }
        else if (e.getSource()==allUser){
            jpAll.setVisible(true);
            jpAdd.setVisible(false);
            jpEdit.setVisible(false);
            jpDelete.setVisible(false);
            jpSearch.setVisible(false);
            clearFields();
            
            jpAll.removeAll();

            idlJLabel.setBounds(20, 50, 50,25);
            jpAddName.setBounds(80, 50, 70,25);
            jpAddUsername.setBounds(170, 50, 80,25);
            jpAddEmail.setBounds(280, 50, 50,25);
            jpAddPassword.setBounds(370, 50, 100,25);
            jpAddDob.setBounds(470, 50, 100,25);
            jpAddGender.setBounds(580, 50, 100,25);

            jpAll.add(jpAddName);
            jpAll.add(jpAddUsername);
            jpAll.add(jpAddEmail);
            jpAll.add(jpAddPassword);
            jpAll.add(idlJLabel);
            jpAll.add(jpAddDob);
            jpAll.add(jpAddGender);

            
            
            
            userList=us.loadAllUser();
            
            if(userList!=null){
                
                int y=50;
                

                
                setLabels();
                for (User u:userList) {
                    //System.out.println(u.getName());
                    
                    
                    JLabel id=new JLabel(String.valueOf((u.getId())));
                    JLabel name=new JLabel(u.getName());
                    JLabel username=new JLabel(u.getUsername());
                    JLabel email=new JLabel(u.getEmail());
                    JLabel password=new JLabel(u.getPassword());
                    JLabel dob=new JLabel(u.getDob());
                    JLabel gender=new JLabel(u.getGender());

                    // id.setText("");
                    // name.setText("");
                    // username.setText("");
                    // email.setText("");
                    // password.setText("");
                    // dob.setText("");
                    // gender.setText("");

                    y+=20;
                    
                    id.setBounds(20, y+10, 50,25);
                    jpAll.add(id);
                    name.setBounds(80, y+10, 50,25);
                    jpAll.add(name);
                    username.setBounds(180, y+10, 50,25);
                    jpAll.add(username);
                    email.setBounds(250, y+10, 150,25);
                    jpAll.add(email);
                    password.setBounds(380, y+10, 150,25);
                    jpAll.add(password);
                    dob.setBounds(470, y+10, 150,25);
                    jpAll.add(dob); 
                    gender.setBounds(590, y+10, 150,25);
                    jpAll.add(gender);
                    id=name=username=email=password=dob=gender=null;
                 }
                 y=0;
                 userList.clear();
                 
            }
            else{
                JOptionPane.showMessageDialog(jpAll, "Data not found","Error",JOptionPane.ERROR_MESSAGE);
            }

        }
        
           
       }
        
    void clearFields(){
        idtField.setText("");
        jpaname.setText("");
        jpausername.setText("");
        jpaemail.setText("");
        jpapassword.setText("");
        jpaconfirmPassword.setText("");
        jpadob.setText("");
        jpamale.setSelected(false);
        jpafemale.setSelected(false);        
        
    }

    void setLabels(){
        jpAddName.setText("Name");
        jpAddUsername.setText("Username");
        jpAddEmail.setText("Email");
        jpAddPassword.setText("Password");
        jpAddDob.setText("Date of Birth");
        jpAddGender.setText("Gender");
    }
    
}