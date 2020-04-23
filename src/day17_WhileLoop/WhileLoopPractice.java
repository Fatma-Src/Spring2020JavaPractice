package day17_WhileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        /*
        ask the user to enter yes or no
        if the user enters other yes or no, repeat the previos step

         */
        Scanner input= new Scanner(System.in);

        System.out.println("Enter Yes or No");
            String word= input.next();
            boolean valid=word.equalsIgnoreCase("Yes")|| word.equalsIgnoreCase("No");


            while(!valid){//while the input is not eyes or no , repeat teh question
                System.out.println("please re-enter");
                word= input.next();
                if(word.equalsIgnoreCase("Yes")|| word.equalsIgnoreCase("No")) {
                    break;
                }
            }

            if(word.equalsIgnoreCase("Yes")){
                System.out.println("Entered yes");
            }
            if(word.equalsIgnoreCase("No")){
                System.out.println("Entered no");
            }




















    }
}
