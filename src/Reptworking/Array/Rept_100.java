package Reptworking.Array;
import java.util.Scanner;
class Rept_100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }

        //leave above alone!  write your code below.
        //Create another loop for your solution!
        for (int i = 0; i < 5; i++) {
            String word = arr[i];
            String word1=word.substring(0,3);
            System.out.println(word1);



        }
    }
}