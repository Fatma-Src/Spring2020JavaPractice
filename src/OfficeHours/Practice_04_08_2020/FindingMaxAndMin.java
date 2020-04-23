package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int i =1;
        int max=-2147483648;
        int min=2147483647;

       while (i<=5){
            System.out.println("Enter a number");
            int num= input.nextInt();
            if (num>max){
                max=num;
            }

            if( num<min){
                min=num;

            }
            i++;
        }
        System.out.println(" The max number is: "+max);
        System.out.println(" The min number is: "+min);

    }
}
