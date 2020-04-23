package Reptworking;

import java.util.Scanner;

public class rept87 {
    public static void main(String[] args) {
        boolean exists = false;

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String wordNew= word.substring(0,4);
        String New1 =word.substring(1,5);
        int wordL= word.length();




            if (wordNew.equalsIgnoreCase("Java" )&&wordL>=3 ){
                System.out.println("true");

            }else if (New1.equalsIgnoreCase("Java") && wordL>=3 ){
                System.out.print("true");

            }else{
                System.out.print("false");
            }






    }
}















