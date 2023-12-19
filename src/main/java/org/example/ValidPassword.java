package org.example;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password");
        String password = scanner.nextLine().trim();

        //String result = checkPassword(password);
        String result = checkPassword2(password);
        System.err.println(result);

        System.out.println();
        boolean isValid = checkPassword3(password);
        System.out.println("isValid = " + isValid);
    }

    private static boolean checkPassword3(String password) {
        final String PASSWORD_PATTERN =
                "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,16}$";
        return password.matches(PASSWORD_PATTERN);
    }

    private static String checkPassword(String password) {
        if(password.length() < 8 || password.length() > 16){
            return "Password length must be between 8 and 16";
        }

        String otherChars = "!.@#$%^&*_";

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasOtherChar = false;

        for (char c : password.toCharArray()) {
            if(Character.isUpperCase(c)) hasUpper=true;
            if(Character.isLowerCase(c)) hasLower=true;
            if(Character.isDigit(c)) hasDigit=true;
            if(otherChars.indexOf(c) != -1) hasOtherChar=true;
        }

        if(!hasUpper){
            return "Password should have upper case letters";
        }

        if(!hasLower){
            return "Password should have lower case letters";
        }
        if(!hasDigit){
            return "Password should have digit characters";
        }

        if(!hasOtherChar){
            return "Password should have at least one character ("+otherChars+")";
        }

        return "Valid password";
    }

    private static String checkPassword2(String password) {
        StringBuilder sb = new StringBuilder();

        if(password.length() < 8 || password.length() > 16){
            sb.append("Password length must be between 8 and 16\n");
        }

        String otherChars = "!.@#$%^&*_";

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasOtherChar = false;

        for (char c : password.toCharArray()) {
            if(Character.isUpperCase(c)) hasUpper=true;
            if(Character.isLowerCase(c)) hasLower=true;
            if(Character.isDigit(c)) hasDigit=true;
            if(otherChars.indexOf(c) != -1) hasOtherChar=true;
        }

        if(!hasUpper){
            sb.append("Password should have upper case letters\n");
        }

        if(!hasLower){
            sb.append("Password should have lower case letters\n");
        }
        if(!hasDigit){
            sb.append("Password should have digit characters\n");
        }

        if(!hasOtherChar){
            sb.append("Password should have at least one character ("+otherChars+")\n");
        }

        if(!sb.isEmpty()){
            return sb.toString();
        }

        return "Valid password";
    }
}
