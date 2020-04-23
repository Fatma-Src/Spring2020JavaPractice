package day19_Arrays;

import java.util.Scanner;

public class TaskHW2 {
/*
Create an array that holds the days
User should be able to enter the day index and
 output should be:“Today is Monday”
 */

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        String[]Days={"Monday", " Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday" };

        System.out.println("Enter the number");
        int i = input.nextInt();

        while(true) {

            String DayofWeek = Days[i - 1];
            System.out.println("Today is "+ DayofWeek);
            System.out.println("Another number?");
            i=input.nextInt();

        }




    }
}
