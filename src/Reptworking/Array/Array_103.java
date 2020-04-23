package Reptworking.Array;

import java.util.Scanner;

public class Array_103 {
    /*
    Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String [] arr= sentence.split(" ");
        int lenght= arr.length;

        for(int i=lenght-1; i>=0; i--){
            reversed+=arr[i]+" ";
        }
        System.out.println(reversed.trim());










    }
}
