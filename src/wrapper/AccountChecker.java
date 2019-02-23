/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

/**
 *
 * @author omar_
 */
public class AccountChecker {
    public boolean check_user_name(String username){
        char c = username.charAt(0);
        return  username.endsWith("@helwan.edu.eg") && username.indexOf("@")<12 && Character.isLetter(c);

    }

    public boolean check_password(String password){
        boolean upper_check = false;
        boolean lower_check = false;
        boolean digit_check = false;

        for (int i = 0 ; i<password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                upper_check = true;
            }
            if (Character.isLowerCase(password.charAt(i))){
                lower_check = true;
            }
            if (Character.isDigit(password.charAt(i))){
                digit_check = true ;
            }
        }


        return  upper_check && lower_check && digit_check && password.length()>5;
    }
}
