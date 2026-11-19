
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login system:");
        System.out.println("Username : ");
        String username = sc.next();
        System.out.println("Password : ");
        String pwd = sc.next();
        LoginService loginService = new LoginService();
        boolean isValid = loginService.validate(username, pwd);
        if(isValid){
            System.out.println("Welcome:" + username);
            System.out.println("Login Successful!You can enter the system.");
        }
        else{
            System.out.println("Invalid Credentials.Login failed.");
            System.out.println("System exited.");
        }
        System.out.println();
        sc.close();
    }
}

