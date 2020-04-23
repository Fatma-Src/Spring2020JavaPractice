package Reptworking;

import java.util.Scanner;

public class Middlenumber65 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int number = word.length();
        int middleNumber = (number/2)+1;
        String result;
        if(number>=5 && number%2!=0){

            result = ""+word.charAt(middleNumber-2)+ word.charAt(middleNumber-1)+ word.charAt(middleNumber)+"";
            System.out.println(result);// Becuse index number 1 number smaller than lenght

        }else{
            System.out.println("invalid");
        }



    }
}
