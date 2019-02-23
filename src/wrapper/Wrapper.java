/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

import java.util.Scanner;

/**
 *
 * @author omar_
 */
public class Wrapper {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {


//         = "gelo@helwan";
//        String password ="Ve1dde";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert Your User Name");
        String username = scanner.nextLine();

        System.out.println("Insert Your Password");
        String password = scanner.nextLine();





       AccountChecker accountChecker = new AccountChecker();
       boolean checku = accountChecker.check_user_name(username);
       boolean checkp = accountChecker.check_password(password);


       if (checku && checkp){
           System.out.println("The Account has been Sucessfully Created !");
       }else {
           System.out.println("Process Faild , Wrong Entry!");
       }

    }
}    
