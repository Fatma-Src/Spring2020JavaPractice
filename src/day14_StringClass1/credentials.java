package day14_StringClass1;

import java.util.Scanner;

public class credentials {
    /* userName=cybertek
       passWork: cybertekschool
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String validUserName = "cybertek";
        System.out.println("Enter your username");

        String inputUsername = input.next();

        System.out.println("Enter your password");
        String inputPassword = input.next();

        if(inputUsername.equals(validUserName)&& inputPassword.equals(validUserName)){

            System.out.println("Log in successfully");
        }else {
            System.out.println("invalid credentials");
        }









    }








}
