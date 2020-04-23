package Reptworking.Array;

import java.util.*;

public class Array_105 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String [] nword= new String[5];

        //TODO: Write your code below
        String last="";
        for(int i = 0; i<5;i++){
            String wordnew= words[i];
            last="" +wordnew.charAt(0)+wordnew.charAt(wordnew.length()-1);
            nword[i]=last;


        }
        System.out.println(Arrays.toString(nword));
    }
}












