package Reptworking.Array;

import java.util.Arrays;
import java.util.Scanner;

public class TASK1 {
    /*

    write a program that asks "enter a name" 10 times, store each of the names in the array
*/
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

       String[] students = new String[10];
       int i=0;
       while (i<10){
           System.out.println("Enter your friend's name:");
           students[i]= input.next();
           i++;
       }
        System.out.println(students[3]);
        System.out.println(Arrays.toString(students));












    }


}
