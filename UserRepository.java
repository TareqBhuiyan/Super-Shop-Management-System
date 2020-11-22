package repositories;
import entities.User;


import java.sql.*;
import java.util.*;


public class UserRepository
{
    Connection con;
    Statement stm;
    ResultSet rs;
	
	User user=new User();
    List<User> userList=new ArrayList<User>();
   public UserRepository()
    {
		
        try{
			//Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
               stm=con.createStatement();
           }
        catch (Exception e) 
        {
            System.out.println("error while connecting: "+e);} 
	}
       
	   
	 public boolean insertToDb(User user){
        int i=0;
        try{
            i=stm.executeUpdate("INSERT INTO users(name,username,email,password,dob,gender) VALUES('"+user.getName()+"','"+user.getUsername()+"','"+user.getEmail()+"','"+user.getPassword()+"','"+user.getDob()+"','"+user.getGender()+"')");
            
        }catch(SQLException e){
            System.out.println(e);
        }
        if(i==1){
            return true;
        }
        else{
            return false;
        }
        
    }
	   
	   
	   
    public Boolean loginValidation(String username,String password)
    {
        try {        
			 
			String sql= "select * from users where username='"+username+"' and password='"+password+"'"; 	
    
            rs=stm.executeQuery(sql);
            if(rs.next())
			{
				return true;
			}
        } catch (SQLException d) 
		{
           
            System.out.println("error while validating: "+d);
            return false;
        }
		 return null;
		
    }


public boolean updateToDb(User user){
        int i=0;
        try{
            i=stm.executeUpdate("UPDATE users SET name='"+user.getName()+"',username='"+user.getUsername()+"',email='"+user.getEmail()+"',password='"+user.getPassword()+"',dob='"+user.getDob()+"',gender='"+user.getGender()+"' WHERE id="+user.getId());
            
        }catch(SQLException e){
            System.out.println(e);
        }
        if(i==1){
            return true;
        }
        else{
            return false;
        }
        
    }

    public boolean removeFromDb(int id){
        int i=0;
        try{
            i=stm.executeUpdate("DELETE FROM users WHERE id="+id);
            
        }catch(SQLException e){
            System.out.println(e);
        }
        if(i==1){
            return true;
        }
        else{
            return false;
        }
        
    }

    public User getUserFromDb(int id){
    
        try{
            rs=stm.executeQuery("SELECT * FROM users WHERE id="+id);
            if(rs.next()){
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setName((rs.getString("name")));
                user.setUsername((rs.getString("username")));
                user.setEmail((rs.getString("email")));
                user.setPassword((rs.getString("password")));
                user.setDob((rs.getString("dob")));
                user.setGender((rs.getString("gender")));
                System.out.println(user.getName());
                return user;
            }
            else{
                return null;
            }
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
        
            return null;
        
        
    }


    public List<User> getAllUser(){
    
        try{
            rs=stm.executeQuery("SELECT * FROM users");
            while(rs.next()){
                user=new User();
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setName((rs.getString("name")));
                user.setUsername((rs.getString("username")));
                user.setEmail((rs.getString("email")));
                user.setPassword((rs.getString("password")));
                user.setDob((rs.getString("dob")));
                user.setGender((rs.getString("gender")));
                userList.add(user);
                
            }
            //System.out.println(userList);
            return userList;
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
        
            return null;
        
        
    }
	
	
	public Boolean checkLogin(String username,String pwd)
    {
        try {        
			 
			String sql= "select * from admin where username='"+username+"' and password='"+pwd+"'"; 	
    
            rs=stm.executeQuery(sql);
            if(rs.next())
            {
                
                return true;
            }
            else
            {
                return false;
            }
        } catch (Exception e) {
          
            System.out.println("error while validating: "+e);
            return false;
        }



}
}