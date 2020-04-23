package day17_WhileLoop;

import java.util.Scanner;

public class Credential {
    public static void main(String[] args) {

        /*
        user; cybertek
        pass: cybertek123

         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter username");
        String userName= input.next();



        System.out.println("Enter password");
        String passWord = input.next();
        //boolean valid=userName.equals("cybertek")&& passWord.equals("cybertek123"
        int count=1;
        while (!(userName.equals("cybertek")&& passWord.equals("cybertek123"))){
        //(!valid)
            System.out.println("Please re enter your credential");

            System.out.println("Enter username");
            userName= input.next();


            System.out.println("Enter password");
             passWord = input.next();

             if((userName.equals("cybertek")&& passWord.equals("cybertek123"))){
                break;
             }//valid =(userName.equals("cybertek")&& passWord.equals("cybertek123")

            count++;
            if(count ==3){
                System.out.println("Your account is locked");
                break;

                }

        }
        if(userName.equals("cybertek")&& passWord.equals("cybertek123")){
        System.out.println("Logged in");}















    }
}
