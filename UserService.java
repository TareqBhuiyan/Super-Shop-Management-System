package services;
import java.util.*;

import entities.User;
import repositories.UserRepository;;

public class UserService{

    User user;
    List<User> userList=new ArrayList<User>();
    UserRepository urp=new UserRepository();
    
    public boolean addNewUser(User user){
        return urp.insertToDb(user);
    }
    public boolean editUser(User user){
        return urp.updateToDb(user);
    }
    public boolean deleteUser(int id){
        return urp.removeFromDb(id);
    }

    public User searchUserById(int id){
        user= urp.getUserFromDb(id);
        return user;
    }
    public List<User> loadAllUser(){
        userList= urp.getAllUser();
         //System.out.println(userList.get(0).getName());
         //System.out.println(userList.get(1).getName());
         //System.out.println(userList.get(2).getName());
        return userList;
    }

}