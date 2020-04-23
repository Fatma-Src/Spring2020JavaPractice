package Reptworking.Array;

import java.util.Scanner;

public class Array_firstlast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for(String each: words){
            String newwords= each;
            int lenght= each.length();
            String firstlast= newwords.substring(0,1)+newwords.substring(newwords.length()-1);
            System.out.println(firstlast);
        }




    }
}

