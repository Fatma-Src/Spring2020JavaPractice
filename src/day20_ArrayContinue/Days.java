package day20_ArrayContinue;

import java.util.Scanner;
/*
?????chehck it bug too much
 */

public class Days {
    public static void main(String[] args) {
        String[]days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner input= new Scanner(System.in);

        System.out.println("Enter number");
        int num= input.nextInt();
        int attemps=1;

        while(num>7 || num<1){
            System.out.println("invalid enter");
            System.out.println("Please enter another number!");
            num=input.nextInt();
            attemps++;
            if(attemps==2&& (num>7||num<1) ) {
                System.out.println("Invalid Entery, you already have 3 attemps");
                System.exit(0);
            }

        }


        String result= days[num-1];
        System.out.println("do you want to enter another number?");
        String answer= input.next();
        while(true) {
            if (answer.equalsIgnoreCase("yes")) {
                num = input.nextInt();
                result = days[num - 1];

            } else {
                System.out.println("Thank you");
            }
            System.out.println(result);
        }













    }
}
