package services;
import ui.UserLogin;
import repositories.UserRepository;
public class LoginService{
   UserRepository urp=new UserRepository();
    public LoginService(){

    }
    public boolean getValidation(String username,String password){
        return urp.loginValidation(username, password);
    }
}