import java.util.regex.*;
import java.util.Scanner;
class regex2{
    public static void main(String args[]){
        String username,password,mobile;
        Scanner log=new Scanner(System.in);
        System.out.println("Enter the username");
        username=log.nextLine();
        System.out.println("Enter the password");
        password=log.nextLine();
        System.out.println("Enter your mobile number");
        mobile=log.nextLine();
        //username can contain only alphabets and it must be more than 5 chars
        if(Pattern.matches("[a-zA-Z@]{5,}",username)){
            if(Pattern.matches("[0-9]{10}",mobile)){
                if(Pattern.matches("[a-zA-Z0-9]{6,}",password)){
                    if(password.equals("12345678"))
                    {
                        System.out.println("Login Success!");                
                    }
                    else{
                        System.out.println("Passsword is wrong");
                    }
                }
                else{
                    System.out.println("Password is not valid");
                }
            }
            else{
                System.out.println("Mobile number is not valid");
            }
        }
        else{
            System.out.println("Username is not valid");
        }
    }
}