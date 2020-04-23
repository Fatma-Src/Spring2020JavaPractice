package Reptworking;

import java.util.Scanner;

public class MiddleOne64 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int wordnumber = word.length();

        String result = "";

        if (wordnumber % 2 != 0 && wordnumber >= 3) {
            int middlenumberOdd = wordnumber / 2 + 1;
            char ch1 = word.charAt(middlenumberOdd - 1);
            System.out.println(ch1);
        }

        if (wordnumber == 1) {
            result = word;
            System.out.println(word + word + word);
        }


        if (wordnumber % 2 == 0 && wordnumber >= 4 ) {

            result = "" + word.charAt(word.length()/2-1) + word.charAt(word.length()/2);
            System.out.println(result);}
        if (wordnumber == 2) {
                System.out.println(word.concat(word));
            }


        }
    }

