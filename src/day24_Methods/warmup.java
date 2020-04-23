package day24_Methods;

import java.util.Scanner;

public class warmup {
    /*
    write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20


			????check why it gives false apligram
     */

    public static void Max(int num1,int num2){
     if(num1>num2){
         System.out.println("Maximun number is: "+num1);
     }else {
         System.out.println("Maximun number is: "+num2);
     }


    }
    public static void Calculation(double num1,double num2,char operator){

     //                                    10        20     *
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;

            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default :
        }

    }
    public static void palindrome(String str){
        str=str.toLowerCase();
        String revesed= "";
        for(int i= revesed.length()-1; i>=0; i--){
            revesed+=str.charAt(i);
        }
        System.out.println(str.equals(revesed));
    }

    public static void main(String[] args) {
        int a= 10;
        int b=20;
        Max(a,b);

        palindrome("level");

       /* int n1=10;
        int n2=2;
        char operations= '*';

        */
       while(true) {
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter num1: ");
           int n1 = scan.nextInt();
           System.out.println("Enter num2: ");
           int n2 = scan.nextInt();
           System.out.println("Enter Operations: ");
           char operator = scan.next().charAt(0);


           Calculation(n1, n2, operator);
           System.out.println("do you want to continue?");
           String answer = scan.next();

           while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("No"))) {
               System.out.println("Invalid entery, pls re-enter");
               System.out.println("do you want to continue?");
               answer = scan.next();
           }
               if( answer.equalsIgnoreCase("no")) {
               break; //System.exit(0);
           }
       }







    }










}
