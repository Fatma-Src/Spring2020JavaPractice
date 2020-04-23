package day20_ArrayContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        /*
        String[]months=new String[12];
        months[0]="Jan";
        size of array is fixed
        size 12:11
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int attempts =1;

        while (num > 12 || num <=0) {
            System.out.println("Invalid entry ");
            System.out.println("Please re-enter the number");
            num = input.nextInt();
            attempts++;
            if(attempts==3&& (num>12||num<=0) ){
                System.out.println("Invalid Entery, you already have 3 attemps");
                System.exit(0);
            }

        }


            String result = months[num - 1];//index number, index number
            System.out.println(result);


    }

}
