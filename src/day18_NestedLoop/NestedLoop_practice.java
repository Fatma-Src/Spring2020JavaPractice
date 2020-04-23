package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoop_practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two number");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue");
            String answer = input.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("No"))){
                System.out.println("Invalid Entry, please re-enter do you want to continue?");
            answer = input.next();
            }

             if (answer.equalsIgnoreCase("No")) {
                    System.out.println(" Thank you for using the calculator");
                    break;
             }


        }

        System.out.println("===============================================");

        /*

        write a program , for the room reservation
        King Bed ==>120$
        Queen Bed ==>100$
        Single Bed ==>80$

        should yu ask which bedroom do you wanna reserve

        if user provided invalid entry ===. please re-enter
        calculate teh totot price
        do you want to reserve another room:
        if yes ==> repeat the previous steps
        if no ==> your total price is $
         if answer either yes or no

         */







    }
}
