package Reptworking.Array;

import java.util.*;

public class Array_115 {
    /*
Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }
        int maxwordlenght=0;

        String Maxword= "";


        for(int i = 0; i< words[i].length();i++){
            if (words[i].length()>maxwordlenght) {
                Maxword= words[i];
            }
        }


        System.out.println(Maxword);
        //write your code below









    }





}
