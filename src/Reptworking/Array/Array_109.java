package Reptworking.Array;

import java.util.Scanner;

public class Array_109 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below
        String [] newarr= new String[5];
        for(int k=0; k<5;  k++){
            String newwords=arr[k];
            String newword1=newwords.substring(0,3);
            System.out.println(newword1);





        }

    }
}

