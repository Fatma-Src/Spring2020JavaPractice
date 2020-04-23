package day14_StringClass1;

import java.util.Scanner;

public class Credentials2 {

    /*valid credentials are:
     username: cybertek
     pasword : cybertekschool
     precondition  user name and pasword can not be empty
     if they are empty ==> pls enter the credentionals
      if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String inputUsername = input.nextLine();

        System.out.println("Enter your password");
        String inputPassword = input.nextLine();

        boolean logedin = inputUsername.equals("Cybertek") && inputPassword.equals("cybertekschool");
        //  if user entered both valid username and password
        boolean InvaliduserName = !inputUsername.equals("Cybertek") &&inputPassword.equals("cybertekschool");
        // if valid user name, invalid password
        boolean InvalidPassWord =inputUsername.equals("Cybertek") &&!inputPassword.equals("cybertekschool");
        // if valid user name, invalid password

        if(!inputUsername.isEmpty()&& ! inputPassword.isEmpty()){//username and password are not empty
            if(logedin){
                System.out.println("Logged in");
            }else if (InvaliduserName){
                System.out.println("Password is correct, username is incorrect");
            }else if (InvalidPassWord) {
                System.out.println("Username is correct but password is not correct");
            }else {
                System.out.println("Both username and password are incorrect");
            }


        }else {//username and password are empty
            System.out.println("please enter the credentional");

        }














    }










}
