package Reptworking.Methods;

import java.util.Scanner;

public class methodnext {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);
    }

        public static void next3(int num0){
            System.out.print((num0+1)+" "+(num0+2)+" " + (num0+3));

        }


    }






