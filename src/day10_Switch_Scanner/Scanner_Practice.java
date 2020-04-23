package day10_Switch_Scanner;

import java.util.Scanner;


public class Scanner_Practice {

    public static void main(String[] args) {//assume the user use onlu 0-127

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your first number");
               byte num1 = input.nextByte();
        System.out.println("Enter your second number");
                byte num2= input.nextByte();
                int total = (num1+num2);
        System.out.println("The sum of " +num1 + "and" + num2 + " are:"+total);//total
        // if we write directly num1+num2 it mak es concenations so we need ()to adddition, (num1+num2)

        System.out.println("======================================================");
        System.out.println("Enter your first number");
         short num3 = input.nextShort();
        System.out.println("Enter your second number");
          short num4 = input.nextShort();

          int total1 = num3+num4;
        System.out.println("The sum of " +num3 + "and" + num4 + " are:"+total1);




    }










}
