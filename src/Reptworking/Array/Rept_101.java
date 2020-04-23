package Reptworking.Array;

import java.util.Scanner;

public class Rept_101 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

     for(int i=0;i<5;i++) {
         String Wordnew= words[i];
         char ch= Wordnew.charAt(Wordnew.length()-1);
         String Words1=""+Wordnew.charAt(0)+ch;
         System.out.println(Words1);


     }





    }

}
