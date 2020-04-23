package day12_JavaRecap;


import java.util.Scanner;

public class Scanner_NextLine_Practicedeneme {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       // 7921 JonesBranch Dr, McLean VA, 22034
        // fullAddresss: Building NUmber , street , city,state zipccode

        System.out.println("Builder Number: ");
        int Bnumber = input.nextInt();//7925 + enter//can we use String Bnumber =
        System.out.println("Building number is :" + Bnumber);
        input.nextLine();// used for takig out the enter from scanner


        System.out.println("Street: ");
        String street = input.nextLine();
        System.out.println("Street is : "+ street);

        System.out.println("Enter Zipcode: ");
        int zipCoce = input.nextInt();

        input.nextLine();// used for takig out the enter from scanner


        System.out.println("enter the city name and state sperated by comma and space");
        String cityState = input.nextLine();
        System.out.println(cityState);

        System.out.println("Enter Zipcode: ");
        int zipCode = input.nextInt();










    }














}
