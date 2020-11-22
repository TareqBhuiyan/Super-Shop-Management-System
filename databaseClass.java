//Sazzad Hossain
package com.mypackages;

import java.sql.*;

public class databaseClass
{
    Connection con;
    Statement stat;
    ResultSet rs;
   public databaseClass()
    {
		
        try{
			Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
               stat=con.createStatement();
           }
        catch (Exception ae) 
        {
            System.out.println("error while connecting: "+ae);
        }
    }
	    //return boolean
    public void myRegister(String firstname,String email,String address,String dob,String gender,String profession, String interests,String username, String password)
    {
        try {        
			 String sql= "insert into student (firstname,email,address,dob,gender,profession,interests,username,password) VALUES ('"+firstname+"','"+email+"','"+address+"','"+dob+"','"+gender+"','"+profession+"','"+interests+"','"+username+"','"+password+"')";		
            stat.executeUpdate(sql);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while insrting: "+e);           
        }
}
        //return boolean
    public Boolean checkLogin(String uname,String pwd)
    {
        try {        
			 
			String sql= "select * from student where username='"+uname+"' and password='"+pwd+"'"; 	
    
            rs=stat.executeQuery(sql);
            if(rs.next())
            {
                //TRUE if the query founds any corresponding data
                return true;
            }
            else
            {
                return false;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating: "+e);
            return false;
        }
		
}

}