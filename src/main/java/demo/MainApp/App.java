package demo.MainApp;

import demo.exceptions.PasswordMismatchException;
import demo.exceptions.UserNotFoundException;
import demo.model.UserDetail;
import demo.service.LoginService;
import demo.service.LoginServiceImpl;

import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter id :");
            Integer id=scanner.nextInt();
            System.out.println("Enter username ");
            String username= scanner.next();
            System.out.println("Enter password");
            String password=scanner.next();
            UserDetail userDetail=new UserDetail();
            userDetail.setUserId(id);
            userDetail.setUserName(username);
            userDetail.setPassword(password);

            LoginService loginService=new LoginServiceImpl();
            //first checks if user existing or not
            try {
            if(loginService.verifyUserNameAndPassword(userDetail)){
                System.out.println("Password verified and you are an existing user");
            }
            else{
                System.out.println("Existing user but wrong password");
            }
            } catch (PasswordMismatchException | UserNotFoundException e) {
                throw new RuntimeException(e);
            }
            //if user not exists then add user to user details
            loginService.createUser(userDetail);
        }


}
