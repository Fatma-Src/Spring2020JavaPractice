package Reptworking.Methods;

import java.util.Scanner;

public class Methods_153 {
    /*
    isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true


     */
    public static boolean isEven(int n){
        boolean result;

        if (n%2==0){
           result=true;
        }else{
         result= false;
        }
        return result;

    }



    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();

        System.out.println(isEven(num));


    }



}
