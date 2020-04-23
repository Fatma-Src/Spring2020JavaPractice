package Reptworking;

import java.util.Scanner;

public class reserve66 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int numword= word.length();
        if(numword<5){
            System.out.println("Too short!");
        }else if (numword>5){
            System.out.println("Too long!");
        }else{
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+
                    word.charAt(1)+word.charAt(0));
        }









    }
}
