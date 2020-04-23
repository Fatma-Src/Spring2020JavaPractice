package Reptworking.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_106 {
    /*
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun

     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below

        String [] arr1=sentence.split(" ");

       for(String  each: arr1){
           System.out.println(each);
       }







    }

}
