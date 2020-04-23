package Reptworking.Methods;

import java.util.Scanner;

public class MethodArray {
    public static void main(String[] args) {


        plus();
    }

    public static void plus(){

        //your code here
        Scanner input= new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();
        int result=num1+num2;
        System.out.println("result: "+result);


    }

}

