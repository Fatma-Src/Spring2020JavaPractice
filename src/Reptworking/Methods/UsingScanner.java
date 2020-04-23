package Reptworking.Methods;

import java.util.Scanner;

public class UsingScanner {
    public static void sign(int n) {
        if(n>0){
            System.out.println("1");
        }
        if(n<0) {
            System.out.println("-1");

        }
        if(n==0){
            System.out.println("0");
        }


    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);
    }

}
