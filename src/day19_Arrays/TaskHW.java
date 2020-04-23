package day19_Arrays;

import java.util.Scanner;

public class TaskHW {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[]students= new String[10];
        int i= 0;
        while(i<10) {
            System.out.println("Enter student name please");
            students[i] = input.next();
            i++;

        }
        for(int k= 0; k<10;k++){
            System.out.print((k+1)+"."+students[k]+"  ");
        }


    }

    public static class TaskHW1 {
        /*
        Create an array that holds 12 months names
        User should be able to enter month index and output should be:
        “The month name is <MonthName>”
         */
        public static void main(String[] args) {
            Scanner input= new Scanner(System.in);


            String[]Months= {"January","February" ,"March","April", "May", "June", "July","August", "September", "October", "November", "December" };
            String answer="";

            System.out.println("Enter the number");
            int i = input.nextInt();


            while( true){

                String monthName = Months[i - 1];
                System.out.println("The month name is " + monthName);

                System.out.println("Another number?");
                 i = input.nextInt();
                }










        }
    }
}
