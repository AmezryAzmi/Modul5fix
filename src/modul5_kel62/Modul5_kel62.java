/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5_kel62;
import java.util.Scanner;
/**
 *
 * @author ROG GL553VD
 */
public class Modul5_kel62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String email, password;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        
        userService satu = new userService( email, password );
        satu.login();  // TODO code application logic here
    }
    
}
