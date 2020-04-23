package Reptworking.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_reverse {
    /*
   Given a String variable sentence,
   write code to type each word in separate lines
   in a reverse order.

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below
        String[] arr=sentence.split(" ");

        int lenght= arr.length;

        for(int i =lenght-1; i>=0;i-- ){
            System.out.println(arr[i]);
        }








    }
}
