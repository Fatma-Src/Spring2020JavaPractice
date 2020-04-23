package Reptworking;

import java.util.Scanner;

public class MergeRept66 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        int numword1= word1.length();
        int numword2 = word2.length();

        if(numword1!=3 && numword2!=3) {
            System.out.println("cannot merge");

        }else {
            System.out.println(""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+
                    word1.charAt(2)+word2.charAt(2)  );

        }




    }

}
