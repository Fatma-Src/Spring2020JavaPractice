package Reptworking.Methods;

import java.util.Scanner;

public class Method_Int_palondirma {
    /*
   Complete a method isPalindrome() that will check if number is a palindrome.
    Print your result as a boolean (true or false).

Example:
input: 1001
output: true

Example:
input: 1234
output: false

     */
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            isPalindrome(num);
        }

        public static void isPalindrome(int num){

        String num1= num+"";

        String reversednum1="";


        for(int i = num1.length()-1;i>=0;i-- ){
            reversednum1+=num1.charAt(i);
       }
       boolean result =(reversednum1.equalsIgnoreCase(num1));
        System.out.println(result);

    }








}
