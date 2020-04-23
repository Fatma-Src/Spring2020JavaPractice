package Reptworking.Array;

import java.util.Scanner;

public class Method_Arrays_uniques {
    /*
    Complete a void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.


Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }


        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(words[i])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(words[i]);
            }
        }
        System.out.println("================================================");
        for (int i = 0; i < words.length; i++) {
            int count1 = 0;
            for (String each : words) {
                if (words[i].equals(each)) {
                    count1++;
                }
            }
            if (count1 == 1) {
                System.out.println(words[i]);
            }
        }

        System.out.println("=============================================");

        for (String each : words) {
            int count2 = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(each)) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(each);

            }
        }
        System.out.println("================================================");
        for (String each : words) {
            int count = 0;
            for (String word : words) {
                if (word.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }

        }
    }
}


