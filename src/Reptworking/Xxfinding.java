package Reptworking;

import java.util.Scanner;

public class Xxfinding {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String beginning= word.substring(0,1);
        String last =word.substring(word.length()-1);

            if (last.equalsIgnoreCase("x")==true  && beginning.equalsIgnoreCase("x")==true) {
                String New = word.substring(1, word.length()-1);
                System.out.println(New);
            } else if(beginning.equalsIgnoreCase("x")==true){
                String newWord=word.substring(1);
                System.out.println(newWord);
            }else if (last.equalsIgnoreCase("x")==true) {
                String newWord1 = word.substring(0, word.length() - 1);
                System.out.println(newWord1);


            }else {
                   System.out.println(word);
            }
    }

}
