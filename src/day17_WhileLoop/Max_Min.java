package day17_WhileLoop;

import day07_IfStatements.MinNumber;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MaxNum = -2147483647 ;//any number the use provided will be greater than this number
        int MinNum= 2147483647 ; // firat user entered varialbe wwill be initilized to maxNUm||minNUm

        for(int i= 1; i<6; i++){//we can use i<=5
            System.out.println("Enter a number ");
            int num= input.nextInt();// 0,1,2,3,4

            if(num>MaxNum){
                MaxNum= num;

            if(num< MinNum){
                MinNum = num;
            }



            }

            System.out.println("Maximum Number:"+MaxNum);
            System.out.println("Minumum Number:"+MinNum);




        }










    }

}
