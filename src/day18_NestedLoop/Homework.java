package day18_NestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework {
    /*write a program for the room reservation:
    King Bed ==> 120$
    Queen Bed ==> 100$
    single Bed ==> 80$
    should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
    calculate the total price
                do you want to reserve another room:
            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter*/


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Which bedroom do you wanna reserve?" +
                "(King Bed, Queen Bed, Single Bed)");



        String RoomStyle = input.nextLine();
        boolean choice = (RoomStyle.equalsIgnoreCase("King Bed")||RoomStyle.equalsIgnoreCase("Queen Bed")||RoomStyle.equalsIgnoreCase("Single Bed"));
        int KingBed = 120;
        int QueenBed= 100;
        int SingleBed= 80;


        while(!(RoomStyle.equalsIgnoreCase("King Bed")
                ||RoomStyle.equalsIgnoreCase("Queen Bed")
                ||RoomStyle.equalsIgnoreCase("Single Bed"))){

            System.out.println("Please re-enter!");
            RoomStyle = input.nextLine();

        }
        if(RoomStyle.equalsIgnoreCase("King Bed")){
            System.out.println("You choose King Bed. Total price is: "+KingBed);
        }else if(RoomStyle.equalsIgnoreCase("Queen Bed")){
            System.out.println("You choose Queen Bed. Total price is: "+QueenBed);
        }else if(RoomStyle.equalsIgnoreCase("Single Bed")){
            System.out.println("You choose Queen Bed. Total price is: "+SingleBed);
        }
        System.out.println("Do you want to reserve another room?");














    }
}
