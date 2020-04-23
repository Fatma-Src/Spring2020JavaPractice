package day14_StringClass1;

import java.util.Scanner;

public class combineTwoString {
    /*
    Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String words1 = input.next();
        System.out.println("Enter second word");
        String words2 = input.next();

       String result = words1.concat(" "+words2).concat(" "+words2).concat(" "+words1);
        System.out.println(result);


    }
}
